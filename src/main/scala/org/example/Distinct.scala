/*
package org.example

import org.apache.spark.sql.SparkSession

object Distinct {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("DISTINCT").master("local").getOrCreate()
    import spark.implicits._

    val data = Seq((1, "jan", 2016), (3, "nov", 2014), (16, "feb", 2014), (3, "nov", 2014))
    val columnNames = Seq("id", "month", "year")
    val df = data.toDF(columnNames: _*)

    val distinctDF = df.dropDuplicates("year")  // Drop duplicates based on the "month" column
    distinctDF.show()
  }
}
*/
