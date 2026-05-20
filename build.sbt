val scala3Version = "2.13.16"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-learn",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.3.0" % Test
  )
