package org.csf.scheme.lang.test

import org.csf.scheme.lang.parser.Parser
import org.csf.scheme.lang.util.TreeUtils
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by agpopikov on 22/12/14.
 */
class ParserTests extends FlatSpec with Matchers {

  "A Tree" should "give target values" in {
    val source = "(define a 1.0)"
    val tree = Parser(source).getTree
    val children = TreeUtils.getTreeChildren(tree)
  }

}
