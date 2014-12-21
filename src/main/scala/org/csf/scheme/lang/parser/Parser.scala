package org.csf.scheme.lang.parser

import java.io.{File, InputStream, ByteArrayInputStream}
import java.nio.charset.StandardCharsets

import org.antlr.runtime.{ANTLRInputStream, CharStream, ANTLRFileStream, CommonTokenStream}
import org.antlr.runtime.tree.{Tree, CommonTree}
import org.csf.scheme.lang.antlr.{SchemeParser, SchemeLexer}

import scala.io.Source

/**
 * Created by agpopikov on 21/12/14.
 */
class Parser(val source: String) {

  private val inputStream: InputStream = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8))
  private val lexer = new SchemeLexer(new ANTLRInputStream(inputStream))
  private val parser = new SchemeParser(new CommonTokenStream(lexer))
  private val tree = parser.sexpr().getTree

  def getTree: Tree = {
    tree
  }

}

object Parser {

  def apply(source: String): Parser = {
    new Parser(source)
  }

  def apply(file: File): Parser = {
    new Parser(Source.fromFile(file).mkString)
  }

}
