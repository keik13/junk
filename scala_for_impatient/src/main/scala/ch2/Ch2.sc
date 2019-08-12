//1
def sgn(number: Int) = if (number > 0) 1 else if (number < 0) -1 else 0
sgn(23)
sgn(-1)
sgn(0)

//2
val u: Unit = {}

//3
var y = 1
var x: Unit = y = 3
y

//4
for (i <- 10.to(0, -1)) {
  println(i)
}

//5
def countdown(n: Int): Unit = {
  for (i <- n.to(0, -1)) {
    println(i)
  }
}
countdown(5)

//6
var r = 1L
for (c <- "Hello") r *= c
println(r)

//7
"Hello".map(BigInt(_)).product

//8
def product(s: String): Long = {
  s.foldLeft(1L)(_ * _)
}
product("Hello")

//9
def prodRec(s: String): Long = {
  if (s.isEmpty) 1L
  else s.head * prodRec(s.tail)
}

def prodTailRec(s: String): Long = {
  @annotation.tailrec
  def prod(s: String, acc: Long): Long = {
    if(s.isEmpty) acc
    else prod(s.tail, s.head * acc)
  }
  prod(s, 1L)
}
prodRec("Hello")
prodTailRec("Hello")

//10
//def xN(x: Int, n: Int)
