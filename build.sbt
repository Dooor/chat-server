name := """chat-server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  // DB接続
  jdbc,
  // play-cache
  cache,
  // websocketのライブラリ
  ws,
  // DBマイグレーション
  evolutions,
  // xUnit用ライブラリ
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  // MySQLに接続するのに必要
  "mysql" % "mysql-connector-java" % "5.1.41",
  // コネクションプールの作成に必要
  "org.scalikejdbc"      %% "scalikejdbc-play-initializer"   % "2.5.+",
  // scalikejdbc で ZonedDateTime を使うためのライブラリ
  "org.scalikejdbc" %% "scalikejdbc-jsr310" % "2.5.2",
  // O/Rマッパー
  "org.skinny-framework" %% "skinny-orm" % "2.3.+",
  // JSON変換用のライブラリ
  "io.spray" %% "spray-json" % "1.3.3"
)
