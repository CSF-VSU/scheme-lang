package org.csf.scheme.lang.util

import org.antlr.runtime.tree.Tree

/**
 * Created by agpopikov on 22/12/14.
 */
object TreeUtils {

  def getTreeChildren(tree: Tree): Seq[Tree] = {
    var i: Int = 0
    for (i <- 0 until tree.getChildCount)
      yield tree.getChild(i)
  }

}
