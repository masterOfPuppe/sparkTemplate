package template.DAL

import org.apache.hadoop.fs.Path
import org.apache.spark.sql.{DataFrame, SparkSession}
import template.common.SparkHolder

object ReadCSV {

  private val sparkSession: SparkSession = SparkHolder.getSparkSessionIstance

  def getDataframe(path : Path): DataFrame =
    sparkSession.read
    .format("csv")
    .load(path.getName)

}
