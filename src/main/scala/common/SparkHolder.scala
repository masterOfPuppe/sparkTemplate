package common

object SparkHolder {

  private var sparkSession : Option[SparkSession] = None

  def createSparkSessionIstance(conf: SparkConf) : Unit ={
    if(sparkSession.isEmpty)
      sparkSession = Some(SparkSession.builder().config(conf).getOrCreate())
  }

  def getSparkSessionIstance : SparkSession =
    sparkSession match{
      case Some(sp) => sp
      case None => throw new Exception("SparkSession is not initialized")
    }

  def stopCurrentSparkSession : Unit = {
    sparkSession.foreach(_.close)
    sparkSession = None
  }


}
