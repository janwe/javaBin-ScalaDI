organization := "com.github.janwe"

name := "scaladi"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.8.2" % "test",
    "org.scalatest" %% "scalatest" % "1.6.1" % "test",
    "org.scala-tools" % "subcut_2.9.0" % "0.9"
)
