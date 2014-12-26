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

  def build(source: String): String = {
    val header =
      """import Environment

         object SchemeApp extends App {
            val environment = Environment()

      """.stripMargin
    //
    val footer =
      """

        }
      """.stripMargin
    //
    val tree = Parser(source).getTree
    val output = (for (child <- TreeUtils.getTreeChildren(tree))
                      yield buildTree(child)).reduce((a, b) => s"$a\n$b")
    //
    s"$header\n$output\n$footer"
  }

  private def buildTree(tree: Tree): String = {
    val operation = generateValue(tree)
    val params = mutable.MutableList[String]()
    for (child <- TreeUtils.getTreeChildren(tree)) {
      if (parseValue(child).isInstanceOf[SIdent] && (!parseValue(tree).asInstanceOf[SIdent].isDefine)) {
        params += buildTree(child)
      } else {
        params += generateValue(child)
      }
    }
    val output = if (params.length > 0) params.reduce((a, b) => s"$a, $b") else ""
    s"environment.eval($operation, Seq($output))"
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

  private def generateValue(tree: Tree): String = {
    val value = tree.getText
    val lexerType = tree.getType
    lexerType match {
      case SchemeLexer.NUMBER => s"new SNumber($value)"
      case SchemeLexer.STRING => "new SString(\"" + value + "\")"
      case SchemeLexer.ID => "new SIdent(\"" + value + "\")"
      case SchemeLexer.BOOLEAN => s"new SBoolean($value)"
    }
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