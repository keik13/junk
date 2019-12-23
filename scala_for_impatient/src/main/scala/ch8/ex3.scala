package ch8

object ex3 extends App{
  List(new Snake("solid", 20, 12), new Dog("circle", 2), new Fish("black", 0)).foreach(_.voice())
}

abstract class Pet(val name: String, var age: Int) {
  var hungry: Boolean = true
  def voice()
  def food(): Unit = {hungry = false}
}
class Snake(name: String, age: Int, var length: Double) extends Pet(name, age) {
  override def voice(): Unit = println("SHShshshhh")
}
class Dog(name: String, age: Int) extends Pet(name, age) {
  override def voice(): Unit = println("wuf-wuf")
}
class PatrolDog(name: String, age: Int) extends Pet(name, age) {
  override def voice(): Unit = println("Rrrrr")
}
class Cat(name: String, age: Int) extends Pet(name, age) {
  override def voice(): Unit = println("miu")
}
class Fish(name: String, age: Int) extends Pet(name, age) {
  override def voice(): Unit = println("")
}