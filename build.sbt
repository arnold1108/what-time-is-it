scalaVersion := "2.13.8"
name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"

lazy val root = (project in file(".")).
   settings(
     inThisBuild(List(
       organization := "ch.epfl.scala",
       scalaVersion := "2.13.8"
     )),
 name := "hello-world"

scalacOptions += "-Xfatal-warnings"
