import org.scalatest.{BeforeAndAfterAll, MustMatchers, WordSpec}

class MainSpec extends WordSpec with MustMatchers with BeforeAndAfterAll {
  override protected def beforeAll(): Unit = {

  }

  "Main" must {
    "rightly work" in {
      Main.run
    }
  }

  override protected def afterAll(): Unit = {

  }
}

}
