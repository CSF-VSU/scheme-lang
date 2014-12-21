package org.csf.scheme.lang.core

/**
 * Created by agpopikov on 21/12/14.
 */
trait Type {

}

class SNumber(val value: Double) extends Type {

  implicit def toSString: SString = {
    new SString(value.toString)
  }

}

class SString(val value: String) extends Type {

}

class SFunction[T](val value: Seq[Type] => T) extends Type {

  def apply(params: Seq[Type]): T = {
    value(params)
  }

}

class SList(val value: Seq[Type]) extends Type {

}

class SChar(val value: Char) extends Type {

}

class SNone extends Type {

}

class SBoolean(val value: Boolean) extends Type {

}