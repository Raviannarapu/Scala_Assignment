package org.example.Demo.Sbclass

import org.apache.spark.SparkContext

object Class {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext("local[*]","ravi")
    sc.setLogLevel("Error")
    //practice 01
    /*val data = Array(1, 2, 3, 4, 5)
    val rdd = sc.parallelize(data)
    rdd.collect.foreach(println)*/
   //practice 02
/*    val rdd = sc.parallelize(Array(1, 2, 3, 4, 5))
    val average = rdd.mean()
    println(average)*/
   //practice 03
    /*val rdd = sc.parallelize(Array(1, 2, 3, 4, 5,6))
    val sum = rdd.reduce(_ + _)
    val count = rdd.count()
    val average = sum/count.toDouble
    println("Average value: " + average)*/
    //practice 03
    /*val rdd = sc.parallelize(Array(1, 2, 3, 4, 5))
    val filteredRdd = rdd.filter(x => x % 2 != 0)
    val count = filteredRdd.count()
    println("Count of odd numbers: " + count)*/

    //practice 04
/*
    val rdd1 = sc.parallelize(Array((1, "apple"), (2, "banana"), (3,
      "orange")))
    val rdd2 = sc.parallelize(Array((1, "red"), (2, "yellow"), (4,
      "green")))

    val joinedRdd = rdd1.join(rdd2)
    joinedRdd.foreach(println)*/

    //practice 05
   /* val rdd1 = sc.parallelize(Array(1, 2, 3, 4, 5))
    val rdd2 = sc.parallelize(Array(3, 4, 5))
    val subtractedRdd = rdd1.subtract(rdd2)
    subtractedRdd.foreach(println)*/

    //practice 06
/*
    val rdd1 = sc.parallelize(Array(1, 2, 3))
    val rdd2 = sc.parallelize(Array(3, 4, 5))
    val unionRdd = rdd1.union(rdd2)
    unionRdd.foreach(println)*/

    //practice 07
    /*
    val rdd1 = sc.parallelize(Array(1, 2, 3))
    val rdd2 = sc.parallelize(Array("A", "B"))
    val cartesianRdd = rdd1.cartesian(rdd2)
    cartesianRdd.foreach(println)*/

    //practice 08

/*    val rdd1 = sc.parallelize(Array(1, 2, 3, 4, 5))
    val rdd2 = sc.parallelize(Array(4, 5, 6, 7, 8))
    val intersectionRdd = rdd1.intersection(rdd2)
    intersectionRdd.foreach(println)*/

    //practice 09
/*
    val rdd = sc.parallelize(Array("apple", "banana", "orange",
      "pear", "grape"))
    val searchTerm = "orange"
    val filteredRdd = rdd.filter(x => x == searchTerm)*/

    //practice 10

    /*val rdd = sc.parallelize(Array("apple", "banana", "orange",
      "pear", "grape"))
    val searchTerm = "an"
    val filteredRdd = rdd.filter(x => x.contains(searchTerm))*/

    //You have an RDD containing web server logs with the following schema: (timestamp, ip_address, url).
    // You want to find the top 10 most frequently accessed URLs.
    // How would you approach this problem using RDD operations?

    //web server logs with schema(timestamp, ip_address, url)

    /*val urlCountsRDD = logsRDD.map { case (_, _, url) => (url, 1) }
      .reduceByKey(_ + _)*/

  }

}
