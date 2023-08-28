/*
package org.example.Demo.Sbclass

import org.apache.spark.{SparkConf, SparkContext}

object WebServerAnalysis {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("TopURLs").setMaster("local[*]")
    val sc = new SparkContext(conf)

    // Create your RDD with web server logs
    val logsData = Seq(
      ("2023-08-01 10:30:00", "192.168.1.1", "/page1"),
      ("2023-08-01 10:31:00", "192.168.1.2", "/page2"))
      // ... more log data ...


    val logsRDD = sc.parallelize(logsData) // Create RDD from the data

    val top10URLs = logsRDD.map { case (_, _, url) => (url, 1) }
      .reduceByKey(_ + _) // Count the occurrences of each URL
      .sortBy(_._2, ascending = false) // Sort by count in descending order
      .take(10) // Take the top 10 URLs

    // Print the top 10 URLs and their counts
    top10URLs.foreach { case (url, count) =>
      println(s"URL: $url, Count: $count")
    }

    sc.stop()
  }
}








*/
