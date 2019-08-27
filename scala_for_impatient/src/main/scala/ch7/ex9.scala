package ch7

object ex9 extends App {
  val user = System.getProperty("user.name")
  val password = Console.in.readLine()
  if(password != "sec") Console.err.println("not sec")
  else Console.out.println(s"Hello ${user}")
}
