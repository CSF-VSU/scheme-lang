name := "scheme-lang"

version := "1.0"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.antlr" % "antlr-runtime" % "3.5.2"
)

//  #&&

val antlr = ("java -jar lib/antlr-3.5.2-complete.jar src/main/antlr/Scheme.g" #&&
  "mkdir -p src/main/java/org/csf/scheme/lang/antlr" #&&
  "mv src/main/antlr/SchemeParser.java src/main/java/org/csf/scheme/lang/antlr" #&&
  "mv src/main/antlr/SchemeLexer.java src/main/java/org/csf/scheme/lang/antlr").!