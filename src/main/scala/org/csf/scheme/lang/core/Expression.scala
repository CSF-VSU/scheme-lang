package org.csf.scheme.lang.core

import org.antlr.runtime.tree.Tree

/**
 * Created by agpopikov on 04/01/15.
 */
abstract class Expression {

  abstract def interpret()

  abstract def build()

}

object Expression {

}

class IfExpression extends Expression {

  override def interpret(): Unit = ???

  override def build(): Unit = ???

}

class CondExpression extends Expression {

  override def interpret() = ???

  override def build() = ???

}

class SetExpression extends Expression {

  override def interpret(): Unit = ???

  override def build(): Unit = ???

}

class LetExpression extends Expression {

  override def interpret(): Unit = ???

  override def build(): Unit = ???

}