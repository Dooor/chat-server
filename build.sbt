name := """chat-server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  evolutions,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "mysql" % "mysql-connector-java" % "5.1.41",
  "org.scalikejdbc"      %% "scalikejdbc-play-initializer"   % "2.5.+",
  "org.skinny-framework" %% "skinny-orm" % "2.3.+",
  "io.spray" %% "spray-json" % "1.3.3"
)
