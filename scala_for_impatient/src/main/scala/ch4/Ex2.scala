package ch4

import scala.collection.mutable
import scala.io.Source

object Ex2 extends App {
  val file = Source.fromFile("src/main/scala/ch4/myfile.txt")
  val m = mutable.Map[String, Int]() withDefaultValue 0
  for (e <- file.mkString.split("\\s+")) {
    m(e) += 1
  }
  println(m)
  file.close()
}
