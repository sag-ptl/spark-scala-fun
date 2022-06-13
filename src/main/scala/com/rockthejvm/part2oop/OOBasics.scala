package com.rockthejvm.part2oop

import java.io.Writer

object OOBasics {

  //the description is little long but for reference look into   Object-Oriented Basics: Exercises

  class Writer(fname: String, lname: String, val DOY: Int)  {
    def fullName = s"$fname $lname"
  }

  class Novel(val bookTitle: String, yearRelease: Int,val author: String) {

    def authorAge(yearRelease: Int, DOY: Int): Int = {
      yearRelease - DOY
    }
  }


  def main(args: Array[String]): Unit = {
    val getWriter = new Writer("Chetan", "Bhagat", 1987)
    println(getWriter.fullName)

    val getNovel = new Novel("3 Mistakes of life", 2022, "not Chetan Bhagat")
    val getAge = getNovel.authorAge(2020, getWriter.DOY)
    println(getAge)

    val yetAnotherEdition = new Novel(getNovel.bookTitle, 2022, getNovel.author)
    val getAge2 = yetAnotherEdition.authorAge(2022, getWriter.DOY)
    println(getAge2)


  }

}
