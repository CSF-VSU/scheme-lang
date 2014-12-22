package org.csf.scheme.lang.core

/**
 * Created by agpopikov on 21/12/14.
 */
trait Type {

}

class SIdent(val name: String) extends Type {

  override def toString: String = {
    s"$name: Ident"
  }

  def isDefine: Boolean = name == "define"

}

class SNumber(val value: Double) extends Type {

  implicit def toSString: SString = {
    new SString(value.toString)
  }

  override def toString: String = {
    s"$value: Number"
  }

}

class SString(val value: String) extends Type {

  override def toString: String = {
    s"$value: String"
  }

}

class SFunction[T](val value: Seq[Type] => T) extends Type {

  def apply(params: Seq[Type]): T = {
    value(params)
  }

  override def toString: String = {
    s"$value: Function"
  }

}

class SList(val value: Seq[Type]) extends Type {

  override def toString: String = {
    s"$value: List"
  }

}

class SChar(val value: Char) extends Type {

  override def toString: String = {
    s"$value: Char"
  }

}

class SNone extends Type {
  s"None"
}

class SBoolean(val value: Boolean) extends Type {

  override def toString: String = {
    s"$value: Boolean"
  }

}