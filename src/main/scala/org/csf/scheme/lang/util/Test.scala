package org.csf.scheme.lang.util

import org.csf.scheme.lang.core.SNumber
import org.csf.scheme.lang.interpret.Interpret
import org.csf.scheme.lang.parser.Parser

/**
 * Created by agpopikov on 22/12/14.
 */
object Test extends App {

  val source = "(define a 1) (+ 1 2 (* 4 5)) (+ a 2)"
  val tree = Parser(source).getTree
  val children = TreeUtils.getTreeChildren(tree)
  val interpret = new Interpret()
  interpret.interpret(source)
}
