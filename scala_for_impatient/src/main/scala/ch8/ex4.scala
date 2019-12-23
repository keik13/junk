package ch8

import scala.collection.mutable.ArrayBuffer

object ex4 extends App{
  val b = new Bundle(ArrayBuffer(new SimpleItem(100, "manga"), new SimpleItem(200, "anime")))
  println(b.price)
  println(b.description)
  b.addItem(new SimpleItem(300, "hentai"))
  println(b.price)
  println(b.description)
}

abstract class Item {
  def price: Double
  def description: String
}
class SimpleItem(override val price: Double, override val description: String) extends Item

class Bundle(items: ArrayBuffer[Item]) {
  def price: Double = items.map(_.price).sum
  def description: String = items.map(_.description).mkString(" ")
  def addItem(item: Item): ArrayBuffer[Item] = {
    items += item
  }
}