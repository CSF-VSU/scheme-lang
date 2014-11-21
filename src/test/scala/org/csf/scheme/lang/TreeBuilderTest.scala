package org.csf.scheme.lang

import org.csf.scheme.lang.util.TreeBuilder
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by agpopikov on 18/11/14.
 */
class TreeBuilderTest extends FlatSpec with Matchers {

  "buildDotTree" should "return empty string" in {
    val treeBuilder = new TreeBuilder()

  }

}
