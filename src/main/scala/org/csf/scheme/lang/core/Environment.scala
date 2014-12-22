package org.csf.scheme.lang.core

import scala.collection.mutable

/**
 * Created by agpopikov on 21/12/14.
 */
class Environment {

  val functions: mutable.Map[String, SFunction[Type]] = mutable.Map[String, SFunction[Type]]() ++ Predefined.functions(this)

  def eval(operation: SIdent, params: Seq[Type]): Type = {
    functions(operation.name)(params)
  }

}

object Environment {

  def apply(): Environment = {
    new Environment()
  }

}
