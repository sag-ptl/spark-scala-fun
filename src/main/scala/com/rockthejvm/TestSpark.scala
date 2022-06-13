package com.rockthejvm
import org.apache.spark.sql.SparkSession
object TestSpark {
  def main(arg: Array[String]): Unit = {
    val spark = SparkSession.builder
      .master("local[*]")
      .appName("Sample App")
      .getOrCreate()
    val data = spark.sparkContext.parallelize(
      Seq("I like Spark", "Spark is awesome", "My first Spark job is working now and is counting down these words")
    )
    val filtered = data.filter(line => line.contains("Spark"))
    filtered.collect().foreach(print)

  }
}
