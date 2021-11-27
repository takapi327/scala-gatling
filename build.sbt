organization := "io.github.takapi327"
scalaVersion := "2.13.3"
startYear    := Some(2021)

name    := "scala-gatling"
version := "1.0.0-SNAPSHOT"

lazy val GATLING_VERSION = "3.7.2"

lazy val root = (project in file("."))
  .enablePlugins(GatlingPlugin)

libraryDependencies ++= Seq(
  "io.gatling"            % "gatling-test-framework"    % GATLING_VERSION % "test",
  "io.gatling.highcharts" % "gatling-charts-highcharts" % GATLING_VERSION % "test"
)

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions"
)
