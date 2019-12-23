package ch8

object ex11 extends App {
  class Point(val p:(Long, Long)) extends AnyVal {
    def x: Long = p._1
    def y: Long = p._2
  }
  val p = new Point(1, 2)
  println(s"x - ${p.x}; y - ${p.y}")
}
