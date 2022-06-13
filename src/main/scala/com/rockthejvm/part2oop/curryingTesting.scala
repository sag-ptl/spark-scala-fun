package com.rockthejvm.part2oop

object curryingTesting {

  def add2(a: Int) = (b: Int) => a+b

  def main(args: Array[String]): Unit = {

    val res = add2(55)
    val op = res(10)
    println(op)
 
  }

}
