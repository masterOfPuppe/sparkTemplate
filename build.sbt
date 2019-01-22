name := "sparkTemplate"

version := "0.1"

scalaVersion := "2.11.11"

val sparkVersion = "2.4.0"
val scalaTest = "3.2.0-SNAP10"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalaTest,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
