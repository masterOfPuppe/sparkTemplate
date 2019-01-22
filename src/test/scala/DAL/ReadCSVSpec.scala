package DAL

import org.scalatest.{BeforeAndAfterAll, MustMatchers, WordSpec}

class ReadCSVSpec extends WordSpec with MustMatchers with BeforeAndAfterAll {
  override protected def beforeAll(): Unit = {

  }

  "readerCSV" must {
    "rightly work" in {
      1 must be(1)
    }
  }

  override protected def afterAll(): Unit = {

  }
}
