package ch4

import java.util

import scala.collection.JavaConverters.mapAsScalaMap
import scala.collection.mutable
import scala.io.Source

object Ex5 extends App {
  val file = Source.fromFile("src/main/scala/ch4/myfile.txt")
  val m: mutable.Map[String, Int] = mapAsScalaMap(new util.TreeMap[String, Int]) withDefault(_ => 0)
  for (e <- file.mkString.split("\\s+")) {
    m(e) += 1
  }
  println(m)
  file.close()
}
