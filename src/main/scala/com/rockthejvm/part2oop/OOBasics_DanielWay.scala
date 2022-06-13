package com.rockthejvm.part2oop

object OOBasics_DanielWay {

//the description is in the class recording of the excercise. It is kinda long

  class Writer(fname: String, lname: String, val DOY: Int) {
    def printName: String = s"$fname $lname"
  }

  class Novel(bookTitle: String, yearRelease: Int, author: Writer) {
    val getAgeAtYearRelease = yearRelease - author.DOY

    def isWrittenBy(author: Writer): Boolean = {
      this.author == author
    }
  }

  def main(args: Array[String]): Unit = {
    val fromWriter = new Writer("JJ", "Watson", 1987)
    val fakeWriter = new Writer("JJ", "Watson", 1988)
    val fromNovel = new Novel("My Book is great", 2022, fromWriter)

    println(fromNovel.isWrittenBy(fakeWriter))// should return false
    println(fromNovel.isWrittenBy(fromWriter))// should return true
    //println(fromWriter.printName)

    println(fromNovel.getAgeAtYearRelease)

  }

}
