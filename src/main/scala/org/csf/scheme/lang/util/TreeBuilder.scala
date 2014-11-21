package org.csf.scheme.lang.util

import java.io.File

import org.antlr.runtime.tree.Tree
import org.csf.scheme.lang.antlr.SchemeParser

/**
 * Created by agpopikov on 07/11/14.
 */
class TreeBuilder {

  def renderDotTree(tree: Tree, filename: String): Unit = {

  }

  def renderDotTree(tree: Tree, file: File): Unit = {

  }

  private def buildDotTree(tree: Tree): String = {
    var vertexes: Map[String, Tree] = Map()
    var edges: Seq[Seq[String]] = Seq()

    def buildTrees(tree: Tree, currentPath: Seq[String]): Unit = {
      val children = getTreeChildren(tree)
      val currentVertex = (generateVertexNumber().toString, tree)
      vertexes += currentVertex
      for (child <- children) {
        buildTrees(child, currentPath :+ currentVertex._1)
      }
      if (children.isEmpty) {
        edges ++= currentPath :+ currentVertex._1
      }
    }

    buildTrees(tree, Seq[String]())

    // print vertexes
    val vertexesString =
      for ((key, value) <- vertexes) {
        val name = key
        val text = value.getText
        val typeName = getTypeName(value.getType)
        s"$name [label=\"$text: $typeName\""
      }

    // print edges
    val edgesString = edges.map(path => "%s;".format(path.reduce((a, b) => s"$a -- $b"))).reduce((a, b) => a + b)

    ""
  }

  private var vertexNumber = 1

  private def generateVertexNumber(): Int = {
    vertexNumber += 1
    vertexNumber
  }

  private def getTreeChildren(tree: Tree): Seq[Tree] = {
    for (i <- 0 until tree.getChildCount) yield tree.getChild(i)
  }

  private def getTypeName(typeId: Int): String = {
    val schemeParser = new SchemeParser(null)

    val fields = Map[Int, String]
      for (field <- schemeParser.getClass.getFields if field.getType == Int.getClass)
          yield (field.getName, field.getInt(null))

    fields
  }

}
