package ch7

object ex1 extends App {

}

package com {
  package horstmann {
    object A {val s = "hello"}
    package impatient {
      object B {
        def b = println(A.s)
      }
    }
  }
}

package com.horstmann.impatient {
  object C {
//    def b = println(A.s)
  }
}