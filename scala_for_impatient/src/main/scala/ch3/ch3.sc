import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Buffer

//1
def fillArr(n: Int): Array[Int] = {
  (for (_ <- 0 until n) yield util.Random.nextInt(n)).toArray
}
fillArr(12)

//2
val arr1 = Array(1, 2, 3, 4, 5)
for (i <- 0 until(arr1.length - 1, 2)) {
  val temp = arr1(i)
  arr1(i) = arr1(i + 1)
  arr1(i + 1) = temp
}
arr1

//3
val arr2 = Array(1, 2, 3, 4, 5, 6)

(for (i <- arr2.indices) yield
  if (i % 2 == 0 && i != arr2.length - 1)
    arr2(i + 1)
  else if (i % 2 == 1)
    arr2(i - 1)
  else
    arr2(i))
  .toArray

//4
val arr3 = Array(1, 4, -4, 10, 2, -42, 0, 0)
val res = arr3.filter(_ > 0) ++ arr3.filter(_ <= 0)

//5
val arr4 = Array(1.0, 2.0, 3.5)
arr4.sum / arr4.length

//6
val arr5 = Array(1, 2, 3, 4, 5, 6)
scala.util.Sorting.quickSort[Int](arr5)(Ordering[Int].reverse)
arr5
val ab = ArrayBuffer(1, 2, 3, 4, 5, 6)
ab.sorted(Ordering[Int].reverse)
ab

//7
Array(1, 1, 3, 3, 4).distinct

//8
val arr6 = ArrayBuffer(1, 2, -3, 4, -5, -6, 8, 9)
val negPos = for (i <- arr6.indices if arr6(i) < 0) yield i
for (i <- negPos.reverse.init) arr6.remove(i)
arr6

//9
val arr7 = ArrayBuffer(1, 2, -3, 4, -5, 8, 9, -7, 13, 23, 24)
val negPos2 = for (i <- arr7.indices if arr7(i) < 0) yield i
var startForMove = negPos2(1)
val movePos = for (j <- startForMove until arr7.length if arr7(j) >= 0) yield j
for (n <- movePos) {
  arr7(startForMove) = arr7(n)
  startForMove += 1
}
arr7.trimEnd(negPos2.length - 1)
arr7

//10
java.util.TimeZone.getAvailableIDs
  .filter(_.startsWith("America/"))
  .map(_.stripPrefix("America/"))
  .sorted

//11
import java.awt.datatransfer._
import scala.collection.JavaConverters.asScalaBuffer
val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
val rrr: Buffer[String] = asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))












