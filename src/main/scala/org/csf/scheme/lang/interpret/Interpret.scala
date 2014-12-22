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

  private def eval(tree: Tree): Type = {
    val operation = parseValue(tree.getType, tree.getText).asInstanceOf[SIdent]
    val params = mutable.MutableList[Type]()
    for (child <- TreeUtils.getTreeChildren(tree)) {
      val param = parseValue(child.getType, child.getText)
      if (param.isInstanceOf[SIdent] && (!operation.isDefine)) {
        params += eval(child)
      } else {
        params += param
      }
    }
    environment.eval(operation, params)
  }

  private def parseValue(lexerType: Int, value: String): Type = {
    lexerType match {
      case SchemeLexer.NUMBER => new SNumber(value.toDouble)
      case SchemeLexer.STRING => new SString(value)
      case SchemeLexer.ID => new SIdent(value)
      case SchemeLexer.BOOLEAN => new SBoolean(value.toBoolean)
    }
  }

  private def parseFunction(tree: Tree): SFunction[Type] = {
    null
  }

}
