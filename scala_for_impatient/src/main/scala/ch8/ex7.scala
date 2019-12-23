package ch8

object ex7 extends App {
  class Square(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
    def this() = this(0, 0, 0)
    def this(width: Int) = this(0, 0, width)
  }

  println(new Square())
  println(new Square(20))
  println(new Square(1, 2, 20))
}
