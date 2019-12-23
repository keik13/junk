package ch8

object ex2 extends App{

}
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def currentBalance = balance
  def deposit(amount: Double) = balance += amount; balance
  def withdraw(amount: Double) = balance -= amount; balance
}
class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var free = 3
  def earnMonthlyInterest() = super.deposit(super.currentBalance * 0.99); free = 3
  override def deposit(amount: Double) = if(free > 0) {super.deposit(amount); free -= 1} else super.deposit(amount - 1)
  override def withdraw(amount: Double) = if(free > 0) {super.withdraw(amount); free -= 1} else super.withdraw(amount + 1)
}