name := "Doc-Example"

organizationName := "Typesafe"

organization := "com.typesafe"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M1" % "test"

testOptions += Tests.Argument(TestFrameworks.JUnit, "-s", "-a")
