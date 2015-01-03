package org.csf.scheme.lang.core

/**
 * Created by agpopikov on 29/12/14.
 */
trait Type {

}

class SNumber(val value: Double) extends Type {

}

class SString(val value: String) extends Type {

}

class SBoolean(val value: Boolean) extends Type {

}

class SList[T](val value: Seq[T]) extends Type {

}

class SFunction[A, B](val value: A => B) extends Type {

}