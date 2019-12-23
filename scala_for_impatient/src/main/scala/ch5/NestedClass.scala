package ch5

import ch5.Network.Member

import scala.collection.mutable.ArrayBuffer

class NestedClass extends App {
  val chatter = new Network
  val myFace = new Network

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma

  val barney = myFace.join("Barn")
  fred.contacts += barney
}

class Network {
 private var n = 0

  private val members = new ArrayBuffer[Member]

  def join(name: String): Member = {
    val m = new Member(name)
    members += m
    m
  }
}
object Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
}
