package ch4

import scala.collection.immutable.{SortedMap}
import scala.io.Source

object Ex4 extends App {
  val file = Source.fromFile("src/main/scala/ch4/myfile.txt")
  var m = SortedMap[String, Int]() withDefaultValue 0
  for (e <- file.mkString.split("\\s+")) {
    m = m + (e -> (m(e) + 1))
  }
  println(m)
  file.close()
}
