package DAL

import common.SparkHolder
import org.apache.spark.sql.{DataFrame, SparkSession}

class ReadCSV {

  private val sparkSession: SparkSession = SparkHolder.getSparkSessionIstance

  def getDataframe(path : String): DataFrame =
    sparkSession.read
    .format("csv")
    .load(path)

}
