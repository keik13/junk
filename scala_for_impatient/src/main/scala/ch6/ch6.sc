//1
object Conversions {
  def inchesToCentimeters(inch: Double): Double = {
    inch * 2.54
  }
  def gallonsToLiters(gallon: Double): Double = {
    gallon * 3.78541
  }
  def milesToKilometers(mile: Double): Double = {
    mile * 1.60934
  }
}

//2
abstract class UnitConversions {
  def convert(from: Double): Double
}
object InchesToCentimeters extends UnitConversions {
  override def convert(from: Double) = from * 2.54
}
object GallonsToLiters extends UnitConversions {
  override def convert(from: Double) = from * 3.78541
}
object MilesToKilometers extends UnitConversions {
  override def convert(from: Double) = from * 1.60934
}

//3
object Origin extends java.awt.Point

//4
class Point(val x: Int, val y: Int)
object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)}
println(Point(2, 4).x)

//6
object Suit extends Enumeration {
  type Suit = Value
  val HEART = Value("♥")
  val DIAMOND = Value("♦")
  val SPADE = Value("♠")
  val CLUB = Value("♣")
}
println(Suit.CLUB)

//7
import Suit._
def defineRedSuit(s: Suit): Boolean = {
  s == HEART || s == DIAMOND
}
defineRedSuit(SPADE)
defineRedSuit(DIAMOND)

//8
object RgbCube extends Enumeration {
  val Red = Value(0xff0000)
  val Green = Value(0x00ff00)
  val Blue = Value(0x0000ff)
  val Yellow = Value(0xffff00)
  val Violet = Value(0xff00ff)
  val Black = Value(0x000000)
  val Turquoise = Value(0x00ffff)
  val White = Value(0xffffff)
}