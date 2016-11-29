sbtPlugin := true

name := "flyway-mongo-sbt"

organization := "org.flywaydb"

version := "0-SNAPSHOT"

resolvers += "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"

libraryDependencies ++= Seq(
  "org.flywaydb" % "flyway-core" % "0-SNAPSHOT",
  "org.mongodb" % "mongodb-driver" % "3.3.0"
)
