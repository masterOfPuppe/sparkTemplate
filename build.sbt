name := "sparkTemplate"

version := "0.1"

scalaVersion := "2.11.11"

val hadoopVersion = "3.1.0"
val sparkVersion = "2.4.0"
val scalaTest = "2.2.1"
val scalaCheck = "1.12.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalaTest % "test",
  "org.scalacheck" %% "scalacheck" % scalaCheck % "test",
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.hadoop" % "hadoop-hdfs" % hadoopVersion % Test classifier "tests" ,
  "org.apache.hadoop" % "hadoop-common" % hadoopVersion % Test classifier "tests",
  "org.apache.hadoop" % "hadoop-minicluster" % hadoopVersion
)
