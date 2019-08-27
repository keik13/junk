package ch7

import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}

object ex6 extends App{
  def copyHashMap[K, V](from: JavaHashMap[K, V]): ScalaHashMap[K, V] = {
    val res = new ScalaHashMap[K, V]()
    val it = from.entrySet().iterator()
    while (it.hasNext) {
      val next = it.next()
      res(next.getKey) = next.getValue
    }
    res
  }

  val jhp = new JavaHashMap[String, Int]()
  jhp.put("one", 1)
  jhp.put("two", 2)
  println(copyHashMap(jhp))
}
