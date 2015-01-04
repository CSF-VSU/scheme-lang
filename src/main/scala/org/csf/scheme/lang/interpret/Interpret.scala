package org.csf.scheme.lang.interpret

import org.antlr.runtime.tree.Tree
import org.csf.scheme.lang.parser.Parser

/**
 * Created by agpopikov on 29/12/14.
 */
class Interpret {

  def run(source: String): Unit = {
    val parser = Parser(source)
    for (child <- parser.getTree) {
      interpret(child)
    }
  }

  private def interpret(tree: Tree): Unit = {

  }

}
