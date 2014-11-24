name := "scheme-lang"

version := "1.0"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.antlr" % "antlr4-runtime" % "4.3"
)

//  #&&

val antlr = ("java -jar lib/antlr-4.4-complete.jar src/main/antlr/Scheme.g4" #&&
  "mv src/main/antlr/SchemeParser.java src/main/java/org/csf/scheme/lang/antlr" #&&
  "mv src/main/antlr/SchemeLexer.java src/main/java/org/csf/scheme/lang/antlr" #&&
  "mv src/main/antlr/SchemeBaseListener.java src/main/java/org/csf/scheme/lang/antlr" #&&
  "mv src/main/antlr/SchemeListener.java src/main/java/org/csf/scheme/lang/antlr").!