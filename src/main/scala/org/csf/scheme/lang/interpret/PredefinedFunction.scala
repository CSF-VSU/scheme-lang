package org.csf.scheme.lang.interpret

/**
 * Created by agpopikov on 24/11/14.
 */
trait PredefinedFunction {

  abstract def implementation(values: Seq[Value]): (Seq[Value]) => Value

}

object Predefined {

}

class SumPredefined extends PredefinedFunction{

  override def implementation(values: Seq[Value]): (Seq[Value]) => Value = {

    null
  }

}

