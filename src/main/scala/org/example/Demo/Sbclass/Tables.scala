package org.example.Demo.Sbclass

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.broadcast

object Tables {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("orders_df").getOrCreate()
    import spark.implicits._

    // Define the ordersDF DataFrame without .show()
    val ordersDF = Seq(
      (101, "Product A", 1001),
      (102, "Product B", 1002),
      (103, "Product C", 1003)
    ).toDF("order_id", "product_name", "customer_id")

    // Define the customersDF DataFrame without .show()
    val customersDF = Seq(
      (1001, "Alice"),
      (1002, "Bob"),
      (1003, "Charlie")
    ).toDF("customer_id", "customer_name")

    // Show the DataFrames if you want to display their contents
    ordersDF.show()
    customersDF.show()

    // Perform the join after defining the DataFrames
    val joinedDF = ordersDF.join(broadcast(customersDF), Seq("customer_id"), "inner")

    // Show the result or perform further operations
    joinedDF.show()
  }
}
