import sbt.Keys.libraryDependencies

val scala3Version = "2.12.13"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-3-beginners",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test",
        "net.ruippeixotog" %% "scala-scraper" % "3.0.0",
        "org.apache.spark" %% "spark-core" % "3.0.1",
        "org.apache.spark" %% "spark-sql" % "3.0.1"
        "org.htmlcleaner.HtmlCleaner"
    )
)
