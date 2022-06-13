package com.rockthejvm.part1basics

object Excercise_Functions {

  /**
   * 1. A Greeting function(name, age) => "Hi my name is $name and my age is $age"
   */

  def hello(name: String, age: Int): String = s"Hi my name is ${name} and my age is ${age}"

  /**
   * 2. Create the function which returns the factorail of the number given in the argument
   */

  def aFactorial(num: Int): Int = {
   //ideal way to do it is the recursion, not making excuse but this is very complicated to do it.
   //I also checked and we are not using it in codebase in bright much

   if (num < 0) 1
   else if (num == 0) 1
    else num * aFactorial(num - 1)
  }

  /**
   * 2. Check if number is prime
   */

  def isPrime(num: Int): String = {
    if (num%2 == 0) "Number enetered is prime"
    else "Number enetered is NOT prime"
  }

  def main(args: Array[String]): Unit = {
    val greet = hello("Sagar", 35)

    val ret = aFactorial(4)

    val checkPrime = isPrime(100)
    println(greet)
    println(ret)
    println(checkPrime)
  }
}
