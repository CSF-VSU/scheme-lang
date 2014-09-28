#!/bin/bash 
java -jar /usr/local/lib/antlr-3.5.2-complete.jar src/main/antlr3/Scheme.g && mv src/main/antlr3/*.java src/main/java/org/csf/scheme/lang
