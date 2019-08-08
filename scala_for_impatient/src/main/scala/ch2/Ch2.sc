//1
def sgn(number: Int) = if(number > 0) 1 else if(number < 0) -1 else 0
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
for(i <- 10.to(0, -1)) {
  println(i)
}

//5
def countdown(n: Int): Unit = {
  for(i <- n.to(0, -1)) {
    println(i)
  }
}
countdown(5)

//6
//for(ch1 <- "Hello"; ch2 <- "Hello") {
//
//}
