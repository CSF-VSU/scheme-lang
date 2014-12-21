package org.csf.scheme.lang.core

import com.sun.javaws.exceptions.InvalidArgumentException
import org.csf.scheme.lang.core.BooleanOperations.BooleanOperations
import org.csf.scheme.lang.core.MathOperations.MathOperations

/**
 * Created by agpopikov on 21/12/14
 */
class Predefined(val environment: Environment) {

  def define(params: Seq[Type]): Type = null

  def math(operation: MathOperations, params: Seq[Type]): Type = {
    if (params.forall(_.isInstanceOf[SNumber])) {
      new SNumber(params.map(_.asInstanceOf[SNumber].value).reduce((a,b) => {
        operation match {
          case MathOperations.Sum => a + b
          case MathOperations.Sub => a - b
          case MathOperations.Mul => a * b
          case MathOperations.Div => a / b
          case MathOperations.Mod => a % b
        }
      }))
    } else {
      // todo throw error
      throw new InvalidArgumentException(Array(""))
    }
  }

  def map(params: Seq[Type]): Type = {
    if ((params.length == 2) && params(0).isInstanceOf[SFunction[Type]] && params(1).isInstanceOf[SList]) {
      val function = params(0).asInstanceOf[SFunction[Type]]
      val list = params(1).asInstanceOf[SList]
      new SList(list.value.map(p => function(Seq(p))))
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def filter(params: Seq[Type]): Type = {
    if ((params.length == 2) && params(0).isInstanceOf[SFunction[SBoolean]] && params(1).isInstanceOf[SList]) {
      val predicate = params(0).asInstanceOf[SFunction[SBoolean]]
      val list = params(1).asInstanceOf[SList]
      new SList(list.value.filter(p => predicate(Seq(p)).value))
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def reduce(params: Seq[Type]): Type = {
    if (params.length == 2 && params(0).isInstanceOf[SFunction[Type]] && params.isInstanceOf[SList]) {
      val function = params(0).asInstanceOf[SFunction[Type]]
      val list = params(1).asInstanceOf[SList]
      new SList(list.value.reduce((a, b) => Seq(function(Seq(a, b)))))
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def list(params: Seq[Type]): Type = {
    new SList(params)
  }

  def isType[T](params: Seq[Type]): Type = {
    if (params.length == 1) {
      new SBoolean(params(0).isInstanceOf[T])
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def boolean(operation: BooleanOperations, params: Seq[Type]): Type = {
    if (params.forall(_.isInstanceOf[SBoolean])) {
      if (operation != BooleanOperations.not) {
        new SBoolean(params.map(_.asInstanceOf[SBoolean].value).reduce((a, b) => {
          operation match {
            case BooleanOperations.and => a && b
            case BooleanOperations.or => a || b
          }
        }))
      } else {
        new SBoolean(!params(0).asInstanceOf[SBoolean].value)
      }
    } else {
      // todo throw error
      throw new InvalidArgumentException(Array(""))
    }
  }

}

object Predefined {

  def apply(environment: Environment): Predefined = {
    new Predefined(environment)
  }

}

object MathOperations extends Enumeration {

  type MathOperations = Value
  val Sum, Sub, Mul, Div, Mod = Value

}

object BooleanOperations extends Enumeration {

  type BooleanOperations = Value
  val and, or, not = Value

}
