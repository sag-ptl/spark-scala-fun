package com.rockthejvm.part2oop
import com.rockthejvm
object GenericsTesting {


  class testing {
  def aGenericMethod [B] (element: B) : B = {
    println(element)
    element
  }
}

  def main(args: Array[String]): Unit = {

    val anInstance = new testing
    anInstance.aGenericMethod(33)
  }

}
