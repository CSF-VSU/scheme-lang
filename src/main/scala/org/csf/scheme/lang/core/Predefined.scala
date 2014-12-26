package org.csf.scheme.lang.core

import com.sun.javaws.exceptions.InvalidArgumentException
import org.csf.scheme.lang.core.BooleanOperations.BooleanOperations
import org.csf.scheme.lang.core.ComparisonOperations.ComparisonOperations
import org.csf.scheme.lang.core.MathOperations.MathOperations

import scala.collection.mutable

/**
 * Created by agpopikov on 21/12/14
 */
class Predefined(val environment: Environment) {

  def define()(params: Seq[Type]): Type = {
    if ((params.length == 2) && params(0).isInstanceOf[SIdent]) {
      val ident = params(0).asInstanceOf[SIdent]
      val function = params(1)
      function match {
        case target: SFunction[Type] =>
          environment.functions += (ident.name -> target)
        case _ =>
          environment.functions += (ident.name -> new SFunction[Type](p => function))
      }
      new SNone
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def math(operation: MathOperations)(params: Seq[Type]): Type = {
    if (params.forall(_.isInstanceOf[SNumber])) {
      new SNumber(params.map(_.asInstanceOf[SNumber].value).reduce((a, b) => {
        operation match {
          case MathOperations.add => a + b
          case MathOperations.sub => a - b
          case MathOperations.mul => a * b
          case MathOperations.div => a / b
          case MathOperations.mod => a % b
        }
      }))
    } else {
      // todo throw error
      throw new InvalidArgumentException(Array(""))
    }
  }

  def map()(params: Seq[Type]): Type = {
    if ((params.length == 2) && params(0).isInstanceOf[SFunction[Type]] && params(1).isInstanceOf[SList]) {
      val function = params(0).asInstanceOf[SFunction[Type]]
      val list = params(1).asInstanceOf[SList]
      new SList(list.value.map(p => function(Seq(p))))
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def filter()(params: Seq[Type]): Type = {
    if ((params.length == 2) && params(0).isInstanceOf[SFunction[SBoolean]] && params(1).isInstanceOf[SList]) {
      val predicate = params(0).asInstanceOf[SFunction[SBoolean]]
      val list = params(1).asInstanceOf[SList]
      new SList(list.value.filter(p => predicate(Seq(p)).value))
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def reduce()(params: Seq[Type]): Type = {
    if (params.length == 2 && params(0).isInstanceOf[SFunction[Type]] && params.isInstanceOf[SList]) {
      val function: SFunction[Type] = params(0).asInstanceOf[SFunction[Type]]
      val list = params(1).asInstanceOf[SList]
      // new SList(list.value.reduce((a, b) => function(Seq(a, b))))
      new SNone
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def ifStatement()(params: Seq[Type]): Type = {
    if ((params.length == 3) && params(0).isInstanceOf[SBoolean] && params(1).isInstanceOf[SNumber] &&
          params(2).isInstanceOf[SNumber]) {
      val function1 = params(1).asInstanceOf[SNumber]
      val function2 = params(2).asInstanceOf[SNumber]
      val statement = params(0).asInstanceOf[SBoolean]
      if (statement.value) {
        function1
      } else {
        function2
      }
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }



  def list()(params: Seq[Type]): Type = {
    new SList(params)
  }

  def isType[T]()(params: Seq[Type]): Type = {
    if (params.length == 1) {
      new SBoolean(params(0).isInstanceOf[T])
    } else {
      throw new InvalidArgumentException(Array(""))
    }
  }

  def boolean(operation: BooleanOperations)(params: Seq[Type]): Type = {
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

  def comparison(operation: ComparisonOperations)(params: Seq[Type]): Type = {
    if (params.length == 2 && params.forall(_.isInstanceOf[SNumber])) {
      val a = params(0).asInstanceOf[SNumber].value
      val b = params(1).asInstanceOf[SNumber].value
      new SBoolean(operation match {
          case ComparisonOperations.eq => a == b
          case ComparisonOperations.lt => a < b
          case ComparisonOperations.lte => a <= b
          case ComparisonOperations.gt => a > b
          case ComparisonOperations.gte => a >= b
      })
    } else {
      throw new InvalidArgumentException(Array())
    }
  }

  def write()(params: Seq[Type]): Type = {
    for (param <- params) {
      print(param)
    }
    new SNone
  }

  def writeln()(params: Seq[Type]): Type = {
    for (param <- params) {
      println(param)
    }
    new SNone
  }

}

object Predefined {

  def apply(environment: Environment): Predefined = {
    new Predefined(environment)
  }

  def functions(environment: Environment): Map[String, SFunction[Type]] = {
    val predefined = new Predefined(environment)
    Map (
      "+" -> predefined.math(MathOperations.add)_,
      "-" -> predefined.math(MathOperations.sub)_,
      "*" -> predefined.math(MathOperations.mul)_,
      "/" -> predefined.math(MathOperations.div)_,
      "%" -> predefined.math(MathOperations.mod)_,
      "define" -> predefined.define()_,
      "filter" -> predefined.filter()_,
      "reduce" -> predefined.reduce()_,
      "map" -> predefined.map()_,
      "list" -> predefined.list()_,
      "and" -> predefined.boolean(BooleanOperations.and)_,
      "or" -> predefined.boolean(BooleanOperations.or)_,
      "not" -> predefined.boolean(BooleanOperations.not)_,
      "=" -> predefined.comparison(ComparisonOperations.eq)_,
      ">" -> predefined.comparison(ComparisonOperations.gt)_,
      ">=" -> predefined.comparison(ComparisonOperations.gte)_,
      "<" -> predefined.comparison(ComparisonOperations.lt)_,
      "<=" -> predefined.comparison(ComparisonOperations.lte)_,
      "number?" -> predefined.isType[SNumber]()_,
      "string?" -> predefined.isType[SString]()_,
      "function?" -> predefined.isType[SFunction[Type]]()_,
      "write" -> predefined.write()_,
      "writeln" -> predefined.writeln()_
    ).mapValues(new SFunction(_))
  }

}

object MathOperations extends Enumeration {

  type MathOperations = Value
  val add, sub, mul, div, mod = Value

}

object BooleanOperations extends Enumeration {

  type BooleanOperations = Value
  val and, or, not  = Value

}

object ComparisonOperations extends Enumeration {

  type ComparisonOperations = Value
  val eq, lt, lte, gt, gte = Value

}