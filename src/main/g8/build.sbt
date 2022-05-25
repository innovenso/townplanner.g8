ThisBuild / organization := "$organization$"
ThisBuild / version := "$version$"
ThisBuild / scalaVersion := "2.13.8"
ThisBuild / resolvers += Resolver.mavenLocal

lazy val townplan = project
  .in(file("."))
  .settings(
    name := "$name$",
    libraryDependencies += townplanner,
    libraryDependencies += scalactic,
    libraryDependencies += scalaTest
  )

val townplanner =
  "com.innovenso.townplanner" % "innovenso-townplanner-application_2.13" % "1.19.1"
val scalactic = "org.scalactic" %% "scalactic" % "3.2.11"
val scalaTest = "org.scalatest" %% "scalatest" % "3.2.11" % "test"
