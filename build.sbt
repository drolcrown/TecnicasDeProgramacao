name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

// https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.0-api
libraryDependencies += "org.hibernate.javax.persistence" % "hibernate-jpa-2.0-api" % "1.0.1.Final"

// https://mvnrepository.com/artifact/mysql/mysql-connector-java
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.7-dmr"

libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final" // replace by your jpa implementation
)

// https://mvnrepository.com/artifact/com.cedarsoftware/java-util
libraryDependencies += "com.cedarsoftware" % "java-util" % "1.8.0"

//libraryDependencies += "com.typesafe.play" %% "anorm" % "2.5.3"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test

// https://mvnrepository.com/artifact/com.typesafe.slick/slick_2.11
libraryDependencies += "com.typesafe.slick" % "slick_2.11" % "3.2.1"
