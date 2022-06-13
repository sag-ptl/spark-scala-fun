package com.rockthejvm.part1basics.practice

import org.apache.spark
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.{Encoder, Encoders}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, upper}

object getNamesInSpark {
  def main(args: Array[String]): Unit = {


    val fpath = "C:\\coderepo\\rockthejvm\\scala-3-beginners-master\\src\\main\\scala\\com\\rockthejvm\\sagarPractice\\names.txt"
    val spark = SparkSession
      .builder()
      .appName("Spark SQL basic example")
      .config("spark.master", "local")
      .getOrCreate()

    val df = spark.read.csv(fpath)
    val aMap = df.select(df.columns.map(x => col(x).as(x.toUpperCase())): _*)
    val aLowerCase = df.withColumn( "newOne", upper(col("_c0")) ).drop("_c0")
      aLowerCase.show(false)

  }
}
