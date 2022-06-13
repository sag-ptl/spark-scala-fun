package com.rockthejvm.part1basics.practice
import net.ruippeixotog.scalascraper.model._
import net.ruippeixotog.scalascraper.browser.{HtmlUnitBrowser, JsoupBrowser}

import collection.JavaConverters._
import net.ruippeixotog.scalascraper.scraper.ContentExtractors.text
import net.ruippeixotog.scalascraper.scraper.ContentParsers
import org.apache.spark.sql._
import org.apache.spark.sql.SparkSession
import org.jsoup.Jsoup

object CheckPrice {

  def main(args: Array[String]): Unit = {

   val amz = "https://www.amazon.com/Enfamil-NeuroPro-Infant-Formula-Nutrition/dp/B077MF79H1/ref=sr_1_1?keywords=enfamil+neuropro&qid=1654819647&sr=8-1"
    val ggl = "https://www.google.com/search?q=pytohnhow+to+track+amazon+price&ei=YH-iYpuVCvKpggfC1qagBQ&ved=0ahUKEwibxeSgwKH4AhXylOAKHUKrCVQQ4dUDCA4&uact=5&oq=pytohnhow+to+track+amazon+price&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEKIEMgUIABCiBDIFCAAQogQyBQgAEKIEOgcIABBHELADOgQIABANOggIABAeEAgQBzoICAAQHhAIEA06BQgAEIYDSgQIQRgASgQIRhgAUI0IWMcVYNYXaAJwAXgAgAFriAGiBJIBAzQuMpgBAKABAcgBCMABAQ&sclient=gws-wiz"

    val doc = Jsoup.connect(ggl).get()
    println(doc)
  }
}
