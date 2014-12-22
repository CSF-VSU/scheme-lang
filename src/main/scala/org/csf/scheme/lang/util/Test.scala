package org.csf.scheme.lang.util

import org.csf.scheme.lang.parser.Parser

/**
 * Created by agpopikov on 22/12/14.
 */
object Test extends App {

  val source = "(define a 1.0)"
  val tree = Parser(source).getTree
  val children = TreeUtils.getTreeChildren(tree)

}
