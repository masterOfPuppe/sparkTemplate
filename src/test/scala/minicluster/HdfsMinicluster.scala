package minicluster

import java.io.File

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.hdfs.MiniDFSCluster
import org.apache.hadoop.test.PathUtils
import org.scalatest.{BeforeAndAfterAll, WordSpec}

trait HdfsMinicluster extends WordSpec with BeforeAndAfterAll {

  var hdfsCluster: MiniDFSCluster = _

  override protected def beforeAll(): Unit = {
    println("Starting HDFS Cluster...")

    val baseDir = new File(PathUtils.getTestDir(getClass()), "miniHDFS")
    val conf = new Configuration()
    conf.set(MiniDFSCluster.HDFS_MINIDFS_BASEDIR, baseDir.getAbsolutePath())
    conf.setBoolean("dfs.webhdfs.enabled", true)

    val builder = new MiniDFSCluster.Builder(conf)
    hdfsCluster = builder.nameNodePort(9000)
      .manageNameDfsDirs(true)
      .manageDataDfsDirs(true)
      .format(true)
      .build()

    hdfsCluster.waitClusterUp()
    super.beforeAll()
  }

  override protected def afterAll(): Unit = {
    super.afterAll()
    println("Shutting down HDFS Cluster...")
    hdfsCluster.shutdown
  }
}
