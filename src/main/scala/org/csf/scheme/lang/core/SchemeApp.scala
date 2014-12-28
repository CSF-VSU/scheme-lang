package org.csf.scheme.lang.core

/**
 * Created by agpopikov on 26/12/14.
 */
object SchemeApp extends App {

  val environment = Environment()
  environment.eval(new SIdent("define"), Seq(new SIdent("a"), new SNumber(1)))
  environment.eval(new SIdent("define"), Seq(new SIdent("b"), new SNumber(2)))
  environment.eval(new SIdent("writeln"), Seq(environment.eval(new SIdent("+"), Seq(environment.eval(new SIdent("a"), Seq()), environment.eval(new SIdent("b"), Seq()), environment.eval(new SIdent("*"), Seq(environment.eval(new SIdent("b"), Seq()), new SNumber(2)))))))

}