//1
class Counter {
  private var value = BigInt(0)

  def increment() {
    value += 1
  }

  def current = value
}

//2
class BankAccount {
  private var value: BigDecimal = 0

  def balance = value

  def deposit(amount: BigDecimal) = value += amount

  def withdraw(amount: BigDecimal) = value -= amount
}

//3
class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    if (hours == other.hours) minutes < other.minutes
    else hours < other.hours
  }
}

//4
class Time2(val hours: Int, val minutes: Int) {
  private val time = hours * 60 + minutes

  def before(other: Time2): Boolean = {
    time < other.time
  }
}

//5
import scala.beans.BeanProperty

class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
}

val s = new Student("vasya", 1)
println(s"${s.getId} ${s.getName}")
println(s"${s.id} ${s.name}")

//6
class Person(var age: Int) {
  if (age < 0) age = 0
}

val p = new Person(-3)
println(p.age)

//7
class Person2(fullName: String) {
  val firstName = fullName.split("\\s").head
  val lastName = fullName.split("\\s").last
}
val p2 = new Person2("vasya pupkin")
println(s"${p2.firstName} ${p2.lastName} ")

//8
class Car(val brand: String,
          val model: String,
          val year: Int = -1,
          var number: String = " ") {

}
val c1 = new Car("toyota", "camry")
val c2 = new Car("toyota", "camry", 1998)
val c3 = new Car("toyota", "camry", 1998, "ay777e")
val c4 = new Car("toyota", "camry", number = "ay777e")

//9
class Employee {
  val name: String = "John"
  val salary: Double = 0.0
}