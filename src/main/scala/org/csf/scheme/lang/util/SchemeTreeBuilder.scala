package org.csf.scheme.lang.util

import java.util.UUID

import org.antlr.runtime.tree.Tree

/**
 * Created by agpopikov on 07/11/14.
 */
class SchemeTreeBuilder {


  def buildDotTree(tree: Tree): String = {
    var vertexes: Map[String, String] = Map()
    var edges: Seq[Seq[String]] = Seq()

    def buildTrees(tree: Tree, currentPath: Seq[String]): Unit = {
      val children = getTreeChildren(tree)
      for (child <- children) {
        buildTrees(child, currentPath :+ tree.getText)
      }
    }

    ""
  }

  private def generateUUID(): String = {
    UUID.randomUUID().toString
  }

  private def getTreeChildren(tree: Tree): Seq[Tree] = {
    for (i <- 0 until tree.getChildCount) yield tree.getChild(i)
  }

  def renderDotTree(dotTree: String): Unit = {

  }

}
