package org.csf.scheme.lang.interpret

import scala.collection.immutable.TreeMap

/**
 * Created by agpopikov on 24/11/14.
 */
class Environment(val expressions: Map[IdValue, Value]) {

}

object Environment {

  def apply(): Environment = {
    val environment = new Environment(predefinedValues())
    environment
  }

  private def predefinedValues(): Map[IdValue, Value] = {
    // todo
    null
  }

}
