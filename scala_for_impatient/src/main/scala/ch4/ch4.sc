//1
val store = Map("t-shirt" -> 100, "sneakers" -> 200, "coat" -> 1000)
val discondStore = for((k, v) <- store) yield (k, v * 0.9)

//6
import scala.collection.mutable
import java.util.Calendar
val days = mutable.LinkedHashMap[String, Int]("monday" -> Calendar.MONDAY,
  "tuesday" ->  Calendar.TUESDAY, "wednesday" -> Calendar.WEDNESDAY, "thursday" -> Calendar.THURSDAY,
  "friday" -> Calendar.FRIDAY, "saturday" -> Calendar.SATURDAY, "sunday" -> Calendar.SUNDAY)
days.foreach(println(_))

//7
import scala.collection.JavaConverters._
val props: scala.collection.mutable.Map[String, String] = System.getProperties.asScala
val kingSizeKey = props.keySet.maxBy(_.length).length
val kingSizeValue = props.values.maxBy(_.length).length
println("_" * (kingSizeKey + kingSizeValue + 2))
for((k, v) <- props) {
  val indent = " " * (kingSizeKey - k.length + 2)
  println(f"$k$indent| $v")
}
println("_" * (kingSizeKey + kingSizeValue + 2))

//8
def minmax(values: Array[Int]): (Int, Int) = {
  (values.min, values.max)
}
minmax(Array(1, 3, 4))

//9
def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
  (values.count(_ < v), values.count(_ == v), values.count(_ > v))
}
lteqgt(Array(2,3,4,5,1), 3)

//10
"Hello".zip("World")
