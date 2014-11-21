package org.csf.scheme.lang.util

import java.io.File

import org.antlr.runtime.tree.Tree

import scala.io.Source

/**
 * Created by agpopikov on 18/11/14.
 */
class Parser(val src: String) {



  def getParsedTree(): Tree = {

  }

}

object Parser {

  def apply(src: String): Parser = {
    new Parser(src)
  }

  def apply(file: File): Parser = {
    apply(loadSourceFromFile(file))
  }

  private def loadSourceFromFile(file: File): String = {
    Source.fromFile(file).getLines().reduce((a: String, b: String) => a + b)
  }

}
