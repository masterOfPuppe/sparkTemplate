name := "sparkTemplate"

version := "0.1"

scalaVersion := "2.11.11"

val sparkVersion = "2.3.0.cloudera3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion 
) 