package ch5

object Test extends App{
  val a = new A
 println(a.current)
  a.age_=(2)
  println(a.age)
}

class A {
  def current = 1
  var age = 0
}
