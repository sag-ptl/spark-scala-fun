package com.rockthejvm.part1basics.practice

    //singly linked list
    //[1,2,3] = [1] -> [2] -> [3] -> |
    abstract class LList {
      def head: Int
   /*   def tail: LList
      def isEmpty: Boolean
      def add(element: Int): LList*/

      override def toString = super.toString

    }

  class Empty extends LList {
    override def head: Int = {
      //val myList:Int = myList.(1)
      1
    }
  }

object LListTest {

  def main(args: Array[String]): Unit = {

  }
}