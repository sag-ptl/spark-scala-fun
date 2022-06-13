package com.rockthejvm.part1basics

object DefaultAndNamesArguments {

  def aDefault(a: Int, b: Int = 33, c:Int = 99): Unit = {
    println("My value for a is " + a)
    println("My default value " + b)
    println("My default value for c is " + c)
  }

  def main(args: Array[String]): Unit = {
    aDefault(a= 99,b = 100)
  }
}
