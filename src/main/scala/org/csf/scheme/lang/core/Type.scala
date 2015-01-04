package org.csf.scheme.lang.core

/**
 * Created by agpopikov on 29/12/14.
 */
trait Type {

}

class SNumber(val value: Double) extends Type {

  override def toString: String = s"$value : Number"

}

class SString(val value: String) extends Type {

  override def toString: String = s"$value : String"

}

class SBoolean(val value: Boolean) extends Type {

  override def toString: String = s"$value : Boolean"

}

class SList[T](val value: Seq[T]) extends Type {

  override def toString: String = {
    val list = value.map(_.toString).reduce((a, b) => s"$a, $b")
    s"($list)"
  }

}

class SFunction[T](val value: Seq[Type] => T) extends Type {

  override def toString: String = "Function"

}

class SNone extends Type {

  override def toString: String = "None"

}