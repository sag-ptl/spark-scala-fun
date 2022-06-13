package com.rockthejvm.sagarPractice
import java.io._
import java.io.Reader
import scala.io.Source
object GenericFunction {

  val filePath = "src/main/scala/com/rockthejvm/sagarPractice/names.txt"

  val src = Source.fromFile(filePath)
  for(lines <-src.getLines()){
    src
  }

  def main(args: Array[String]): Unit = {
    src

  }

}
