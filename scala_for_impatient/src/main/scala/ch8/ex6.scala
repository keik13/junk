package ch8

object ex6 extends App {
  type Point = (Double, Double)
  abstract class Shape {
    def centerPoint: Point
  }

  class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape {
    override def centerPoint: Point = {
      ((topLeft._1 + bottomRight._1) / 2, (topLeft._2 + bottomRight._2) / 2)
    }
  }

  class Circle(override val centerPoint: Point, radius: Int) extends Shape

  print(new Rectangle((0, 3),(4, 0)).centerPoint)
}



