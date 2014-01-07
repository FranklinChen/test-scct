name := "test-scct"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/test-scct"))

startYear := Some(2013)

description := "A Scala test-scct"

version := "1.0.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.11.1" % "test",
  "org.specs2" %% "specs2" % "2.3.7" % "test"
)

ScctPlugin.instrumentSettings
