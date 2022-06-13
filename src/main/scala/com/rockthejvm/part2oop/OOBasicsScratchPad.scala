package com.rockthejvm.part2oop

import com.rockthejvm.part2oop.test.sample

object OOBasicsScratchPad {

  def main(args: Array[String]): Unit = {
    val myClass = new animal("Horse")
    mytestingFunc(myClass)

    def mytestingFunc(getSum:animal) = {
      val pp = getSum.sum(3,2)
      println(pp)

      val getAnimal = getSum.iAmAnimal("Duck")
      println(getAnimal)

      val testing = testingOutputasClass(1)
      println(testing)

      def testing1(letssee: test) = {
        letssee.nothingHere
      }

    }



    def testingOutputasClass(ip: Int): animal = {
      val createObj = new animal("Hahaha")
      createObj
    }
  }
}

object test {
  val sample = println("Hello")
  sample
}

case class test(sa: Int) {
  val nothingHere = "kjabdskjasb"
  println(nothingHere)

}



class animal(aml: String) {

  def iAmAnimal(aml1: String): String = {
    s"Hi I am ${aml1}"
  }
    def sum(a: Int, b: Int): Int = {
      val ret = a + b
      ret
    }
}


class cat(aCat: animal) {

  val p = aCat.iAmAnimal("Horse")

}

