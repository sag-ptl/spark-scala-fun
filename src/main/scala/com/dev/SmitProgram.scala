package com.dev

import java.io.PrintWriter
import scala.io.StdIn.readLine

object SmitProgram {

  val origData: Map[String, (String, Int)] = Map(
    "AAPL" -> ("AAPL", 10),
    "TSLA" -> ("TSLA", 50),
    "GOOGL" -> ("GOOGL", 100),
    "MSFT" -> ("MSFT", 99),
    "REMOVEME" -> ("REMOVEME", 99)

  )

  /**
   * Get the user Operation. 1-> Remove, 2-> Add, 3 -> print
   *
   * @return -> Digit for Operations , ticker, Number of stocks
   */

  def getAction: Int = {
    println("What operation do you want to do?")
    println("1-> Sell Stock")
    println("2-> Buy Stock (New/Existing)")
    println("3 -> print")
    println()
    readLine().toInt
  }

  def followUpBuySell(operation: Int): (Int, String, Int) = {
    {
      println("Enter the ticker")
      val ticker = readLine().toUpperCase
      println("Enter the quantity...")
      val qty = readLine().toInt
      (operation, ticker, qty)
    }
  }

  def sellStock(usrTicker: String, quantity: Int, orignalData: Map[String, (String, Int)]): Map[String, (String, Int)] = {
    {
      if (orignalData.contains(usrTicker)) {
        //If All shares are sold, remove from Stock from Map else calculate the new quantity
        if ((quantity - orignalData(usrTicker)._2) == 0) {
          println(s"The total number of stocks for $usrTicker is 0, removing $usrTicker from portfolio")
          val newdata = orignalData.-(usrTicker)
          newdata
        } else {
          println(s"For $usrTicker sold stocks are $quantity,The updated portfolio is...")
          orignalData.-(usrTicker)
          orignalData.+(usrTicker -> (usrTicker, orignalData(usrTicker)._2 - quantity))
        }
      }
      else
        orignalData.-(usrTicker)
    }
  }

  def buyStock(usrTicker: String, quantity: Int, orignalData: Map[String, (String, Int)]): Map[String, (String, Int)] = {
    if (orignalData.contains(usrTicker)) {
      //if stock already in portfoliio, add the number else add new stock to portfolio
      println(s"For $usrTicker purchased additional $quantity,The updated portfolio is...")
      orignalData.-(usrTicker)
      orignalData.+(usrTicker -> (usrTicker, orignalData(usrTicker)._2 + quantity))
    } else {
      println(s"$quantity of new stock $usrTicker purchased ,The updated portfolio is...")
      orignalData.+(usrTicker -> (usrTicker, quantity))
    }
  }

  def writeToFile(filename: String, stockData: Map[String, (String, Int)]): PrintWriter = {

    import java.io.PrintWriter

    new PrintWriter(filename) {
      println("Ticker" + "\t" + "Quantity")
      stockData.foreach {
        case (k) =>
          write(k._1 + "\t")
          write(k._2._2 + "\t")
          println("")
      }
      close()
    }
  }

  def main(args: Array[String]): Unit = {

    println("----Original Data----")
    println()
    origData.foreach(println)
    println()

    val getDataFromUser = getAction

    lazy val buySellActions = followUpBuySell(getDataFromUser)

    val showStuff = {
      val fileName = "Myfile.txt"
      if (getDataFromUser == 1) {
        val sell = sellStock(buySellActions._2, buySellActions._3, origData)
        val writeSell = writeToFile(fileName, sell)
      }
      else if (getDataFromUser == 2) {
        val buy = buyStock(buySellActions._2, buySellActions._3, origData)
        val writeBuy = writeToFile(fileName, buy)

      } else if (getDataFromUser == 3) {
        origData
      }
    }

    println(showStuff)

  }
}
