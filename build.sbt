scalaVersion := "2.13.8"
name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

val Http4sVersion = "0.22.0"

libraryDependencies ++= List(
"org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
"org.http4s" %% "http4s-blaze-server" % Http4sVersion,
"org.http4s" %% "http4s-dsl" % Http4sVersion,
"ch.qos.logback" %% "logback-classic" % "1.2.3"
)

lazy val root = (project in file(".")).
   settings(
     inThisBuild(List(
       organization := "ch.epfl.scala",
       scalaVersion := "2.13.8"
     )),
 name := "hello-world"


