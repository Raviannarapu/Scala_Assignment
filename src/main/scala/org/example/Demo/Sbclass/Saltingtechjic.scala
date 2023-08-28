/*
package org.example.Demo.Sbclass

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.concat_ws

object Saltingtechjic {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("salting").getOrCreate()
    import spark.implicits._

    //df1
    val df1 = Seq(("Hadoop", 2000), ("scala", 2300), ("python", 4000)).toDF("course", "amount")
    //df2
    val df2 = Seq(("Hadoop", 4), ("scala", 2), ("python", 1)).toDF("course", "class_duration")

    df1.createOrReplaceTempView("tab1")
    df2.createOrReplaceTempView("tab2")

    val df3 = spark.sql("""SELECT course,amount,FLOOR(RAND()*10)AS salted_key FROM tab1""")
    val df4 = spark.sql("""SELECT course,class_duration,explode(array(0,1,2,3,4,5,6,7,8,9,10))AS exp FROM tab2""")

    df3.show()
    df4.show(100)


    val joindf = df3.join(df4,concat_ws("_",df3("course"),df3("salted_key")) === concat_ws("_",df4("course"),df4("exp")),"inner")
    joindf.show()

    scala.io.StdIn.readLine()

   //df3.join(df4,df3("exp") === df4("salted_key"),"inner").show()





  }

}
*/
