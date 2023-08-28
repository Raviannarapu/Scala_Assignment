/*
import org.apache.spark.SparkContext

object dagDemo {
  def main(args: Array[String]): Unit = {

    // Create Spark configuration
    val sc = new SparkContext("local[8]", "karth")

    val rdd = sc.textFile("C:\\Users\\sonti\\Downloads\\new 36.txt")

    val rdd1 = rdd.flatMap(x => x.split(" "));
    val rdd2 = rdd1.map(x => (x, 1))

    val rdd4 = rdd2.reduceByKey((x, y) => x + y)

    //val r
    val rdd5 = rdd4.sortBy(x => x._2, false)

    //   rdd5.collect.foreach(println)
    rdd5.take(2).foreach(println)
    scala.io.StdIn.readLine()
  }
}
*/
