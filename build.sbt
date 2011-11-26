organization := "com.github.janwe"

name := "scaladi"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.1"

resolvers += "codahale" at "http://repo.codahale.com"

libraryDependencies ++= Seq(
  "org.scala-tools" % "subcut_2.9.0" % "0.9",
  "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.2",
  "com.codahale" %% "jerkson" % "0.5.0",
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)
