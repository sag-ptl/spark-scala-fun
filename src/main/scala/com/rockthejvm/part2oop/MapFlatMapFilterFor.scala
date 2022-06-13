package com.rockthejvm.part2oop

object MapFlatMapFilterFor {

  val aList = List(1,2,3)

  def main(args: Array[String]): Unit = {

    //val aMap = aList.map(_ => toString)
    val aMap = aList.map(_ *2) //map

    val aFilter = aMap.filter(_ != 4)

    println( aMap)
    println(aFilter)

  }

}
