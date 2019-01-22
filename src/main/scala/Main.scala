import common.SparkHolder
import org.apache.spark.SparkConf

class Main extends App {

  private val conf =new SparkConf()
    .setAppName("Application name")
    .setMaster("local[1]")

  private val _ = SparkHolder.createSparkSessionIstance(conf)

  println("Start")
}
