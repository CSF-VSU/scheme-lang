package org.csf.scheme.lang.core

/**
 * Created by agpopikov on 21/12/14.
 */
class Environment {

  val functions: Map[String, SFunction[Type]] = Predefined.functions(this)

}

object Environment {

  def apply(): Environment = {
    new Environment()
  }

}
