package ch5
import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object Fut extends App{
  val sumF = Future {
    (1L to 100000L).sum
  }

  sumF foreach (s => println(s"s = $s"))

  Thread.sleep(1000)
  val doubledSumF = sumF.flatMap {
    s => Future { s * 2 }
  }

  val tripledSumF = sumF.flatMap(s => Future {
    s * 3
  })

  val resultF = for {
    s1 <- doubledSumF
    s2 <- tripledSumF
  } yield s1 + s2

  Future.successful()
  val result = Await.result(resultF, 5.seconds)
  println(s"result = $result")
}
