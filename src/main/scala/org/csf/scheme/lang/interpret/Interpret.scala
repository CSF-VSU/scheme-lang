package org.csf.scheme.lang.interpret

import org.csf.scheme.lang.core.{Predefined, Environment}
import org.csf.scheme.lang.parser.Parser

/**
 * Created by agpopikov on 22/12/14.
 */
class Interpret {

  val environment = Environment()

  def interpret(source: String): Unit = {
    val tree = Parser(source).getTree


  }

}
