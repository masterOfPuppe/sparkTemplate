package DAL

import java.net.URL

import minicluster.HdfsMinicluster
import org.apache.hadoop.fs.Path
import org.apache.spark.SparkConf
import org.scalatest.MustMatchers
import template.DAL.ReadCSV
import template.common.SparkHolder

class ReadCSVSpec extends HdfsMinicluster with MustMatchers {

  var dataPathHdfs: Path = _

  override protected def beforeAll(): Unit = {
    super.beforeAll()
    val conf =new SparkConf()
      .setAppName("Application name")
      .setMaster("local[1]")
    val _ = SparkHolder.createSparkSessionIstance(conf)

    dataPathHdfs = hdfsCluster.getFileSystem.getWorkingDirectory

    val datapath = getClass.getResource("/data").toString
    hdfsCluster.getFileSystem.copyFromLocalFile(new Path(datapath), dataPathHdfs)
  }

  "readerCSV" must {
    "rightly work" in {
      val dataFrame = ReadCSV.getDataframe(dataPathHdfs)

      dataFrame.count() must be(3)
    }
  }

  override protected def afterAll(): Unit = {
    super.afterAll()
  }
}
