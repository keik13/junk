package ch8

object ex1 extends App{
 val ca = new CheckingAccount(100)
  ca.deposit(100)
  println(ca.currentBalance)
  ca.withdraw(100)
  println(ca.currentBalance)
}
class BankAccounttt(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = balance += amount; balance
  def withdraw(amount: Double) = balance -= amount; balance
}
class CheckingAccount(initialBalance: Double) extends BankAccounttt(initialBalance) {
  override def deposit(amount: Double) = super.deposit(amount - 1)
  override def withdraw(amount: Double) = super.withdraw(amount + 1)
}