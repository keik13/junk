package ch8

object ex9 extends App{
  val a = new Ant
  println(a.env.size)
  println(a.range)
}

class Creature {
  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}
class Ant extends Creature {
  override def range: Int = 2
}