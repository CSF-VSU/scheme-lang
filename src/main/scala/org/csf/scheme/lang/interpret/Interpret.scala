package org.csf.scheme.lang.interpret

import org.antlr.runtime.tree.Tree
import org.csf.scheme.lang.antlr.SchemeLexer
import org.csf.scheme.lang.core._
import org.csf.scheme.lang.parser.Parser
import org.csf.scheme.lang.util.TreeUtils

import scala.collection.mutable

/**
 * Created by agpopikov on 22/12/14.
 */
class Interpret {

  val environment = Environment()

  def interpret(source: String): Unit = {
    val tree = Parser(source).getTree
    for (child <- TreeUtils.getTreeChildren(tree)) {
      println(eval(child))
    }
  }

  def buildMainSection(source: String): String = {
    var result = "object Program extends App {\n"
    result += "val environment = Environment()"
    result += s"val tree = Parser($source).getTree"
    result += s"for (child <- TreeUtils.getTreeChildren(tree)) {  println(eval(child)) \n }"
    result += "private def eval(tree: Tree): Type = {\n    " +
      "val operation = parseValue(tree).asInstanceOf[SIdent]\n    " +
      "val params = mutable.MutableList[Type]()\n    " +
      "for (child <- TreeUtils.getTreeChildren(tree)) {\n      " +
      "val param = parseValue(child)\n      " +
      "if (param.isInstanceOf[SIdent] && (!operation.isDefine)) {\n        " +
      "params += eval(child)\n      } else {\n        " +
      "params += param\n      }\n    }\n    " +
      "environment.eval(operation, params)\n  }\n"
    result += "eval(tree)"
    result += "\n}"
    result
  }

  var functions = Seq[String]()
  var number = 0

  def build(tree: Tree): String = {
    val children = TreeUtils.getTreeChildren(tree)
    val operation = parseValue(tree).asInstanceOf[SIdent]
    val params = mutable.MutableList[Type]()
    for (child <- TreeUtils.getTreeChildren(tree)) {
      val param = parseValue(child)
      if (param.isInstanceOf[SIdent] && (!operation.isDefine)) {
        params += eval(child)
      } else {
        params += param
      }
    }

    def generateParamsString: Seq[String] = {
      for (param <- params if param.isInstanceOf[SNumber])
        yield s"new SNumber(${param.asInstanceOf[SNumber].value})"
    }
    val p = generateParamsString.reduce((a,b) => a + "," + b)
    "environment.eval(new SIdent(\"" + operation + "\"), $p)"
  }

  private def eval(tree: Tree): Type = {
    val operation = parseValue(tree).asInstanceOf[SIdent]
    val params = mutable.MutableList[Type]()
    for (child <- TreeUtils.getTreeChildren(tree)) {
      val param = parseValue(child)
      if (param.isInstanceOf[SIdent] && (!operation.isDefine)) {
        params += eval(child)
      } else {
        params += param
      }
    }
    environment.eval(operation, params)
  }

  private def parseValue(tree: Tree): Type = {
    val value = tree.getText
    val lexerType = tree.getType
    lexerType match {
      case SchemeLexer.NUMBER => new SNumber(value.toDouble)
      case SchemeLexer.STRING => new SString(value)
      case SchemeLexer.ID => new SIdent(value)
      case SchemeLexer.BOOLEAN => new SBoolean(value.toBoolean)
      case SchemeLexer.LAMBDA => new SFunction(lambdaFunction(tree))
    }
  }

  private def lambdaFunction(tree: Tree)(p: Seq[Type]): Type = {
    val lambda = TreeUtils.getTreeChildren(tree)
    val lambdaName = tree.getText
    val definedParams = TreeUtils.getTreeChildren(lambda(0)).map(p => parseValue(p).asInstanceOf[SIdent])
    val body = TreeUtils.getTreeChildren(lambda(1))(0)

    def evalWithTree(tree: Tree): Type = {
      val operation = parseValue(tree).asInstanceOf[SIdent]
      val params = mutable.MutableList[Type]()
      for (child <- TreeUtils.getTreeChildren(tree)) {
        val param = parseValue(child)
        if (param.isInstanceOf[SIdent] && (!operation.isDefine)) {
          val typedParam = param.asInstanceOf[SIdent]
          var i: Int = 0
          var isParam = false
          for (i <- 0 until definedParams.length) {
            if ((definedParams(i).name == typedParam.name)) {
              params += p(i)
              isParam = true
            }
          }
          if (!isParam) {
            params += evalWithTree(child)
          }
        } else {
          params += param
        }
      }
      environment.eval(operation, params)
    }
    evalWithTree(body)
  }

}
