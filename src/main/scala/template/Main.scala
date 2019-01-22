package template

import org.apache.spark.SparkConf
import template.common.SparkHolder

object Main extends App {

  private val conf =new SparkConf()
    .setAppName("Application name")
    .setMaster("local[1]")

  private val _ = SparkHolder.createSparkSessionIstance(conf)

  println("Start")

  SparkHolder.stopCurrentSparkSession
}
