package org.csf.scheme.lang.util

import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.{Paths, Path, Files}

import org.csf.scheme.lang.core.SNumber
import org.csf.scheme.lang.interpret.Interpret
import org.csf.scheme.lang.parser.Parser

import scala.io.Source

/**
 * Created by agpopikov on 22/12/14.
 */
object Test extends App {

//  val source = "(define abs (lambda (x) (if (> x 0) x (* x -1)))) (abs 10) (abs -10) (define a 1) (define b 10) (+ a b)"
  val source = "(define a 1) (define b 2) (writeln (+ a b (* b 2)))"
  // val source = "(+ 1 2 3 (* 2 10))"
  val tree = Parser(source).getTree
  val children = TreeUtils.getTreeChildren(tree)
  val interpret = new Interpret()
  println(interpret.build(source))
  // Files.write(Paths.get("Temp.scala"), generated.getBytes(StandardCharsets.UTF_8))
}
