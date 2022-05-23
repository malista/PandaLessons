ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "PandaLessons",
    idePackagePrefix := Some("org.yaroshynska")

  )

val ScalaTestVersion = "3.2.11"

lazy val testDeps = Vector(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
  "org.scalatest" %% "scalatest-shouldmatchers" % ScalaTestVersion % Test,
  "org.scalatest" %% "scalatest-propspec" % ScalaTestVersion % Test,
  "org.scalatest" %% "scalatest-wordspec" % ScalaTestVersion % Test
)


libraryDependencies ++= testDeps