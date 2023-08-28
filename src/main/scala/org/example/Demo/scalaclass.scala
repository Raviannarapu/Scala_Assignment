/*


//package org.example.Demo
//
//import org.apache.spark.sql.SparkSession
//
//object scalaclass {
//  def main(args: Array[String]): Unit = {
//    val spark = SparkSession.builder().master("local[*]").appName("emp_details").getOrCreate()
//    import spark.implicits._
//    val Data = Seq(("ravi"),("guntur"),("hyd"))
//      .toDF("name","city","place")
//    Data .show()
    //val Columns = Seq("name","birth_place","place")
    //val df = Data.toDF(Columns:_*).show()



//  }
//
//}


package org.example.Demo

import org.apache.spark.sql.SparkSession

object scalaclass {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("emp_details").getOrCreate()
    import spark.implicits._

    // Sample data for the DataFrame
    val data = Seq(("ravi", "guntur", "hyd"))

    // Create a DataFrame using the provided data and column names
    val columnNames = Seq("name", "city", "place")
    val df = data.toDF(columnNames: _*)

    df.show()
  }
}


*/
