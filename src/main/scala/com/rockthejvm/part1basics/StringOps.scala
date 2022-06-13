package com.rockthejvm.part1basics

object StringOps {

  /**
   * Print the value of the string without using println in function
   */

  val aString = "Hey There"

  def printString(inputStr: String) = {
    val ran = Range(inputStr.indexOf(0), inputStr.length - 1)
    ran

  }

  def main(args: Array[String]): Unit = {
    println(printString(aString))

  }

}
