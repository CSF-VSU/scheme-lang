package org.csf.scheme.lang.interpret

import scala.io.StdIn

/**
 * Created by agpopikov on 22/12/14.
 */
object Repl extends App {

  val interpret: Interpret = new Interpret

  // print greeting
  println("SchemeLang REPL.\n")

  while (true) {
    print(">>> ")
    val source = StdIn.readLine()
    interpret.interpret(source)
  }

}
