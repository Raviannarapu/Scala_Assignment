/*
package org.example.Demo.Sbclass
import org.apache.spark.{SparkConf, SparkContext}

object SensorAverage {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("SensorAverage").setMaster("local[*]")
    val sc = new SparkContext(conf)

    // Sample sensor data with schema (sensor_id, timestamp, value)
    val sensorData = Seq(
      ("sensor1", "2023-08-01 10:30:00", 5.0),
      ("sensor2", "2023-08-01 10:30:00", 7.0),
      ("sensor1", "2023-08-01 10:31:00", 6.0),
      ("sensor2", "2023-08-01 10:31:00", 8.0))
      // ... more data ...


    // Create RDD from the sample data
    val sensorDataRDD = sc.parallelize(sensorData)

    // Filter data for the given time period
    val startTime = "2023-08-01 10:30:00"
    val endTime = "2023-08-01 10:31:00"
    val filteredDataRDD = sensorDataRDD.filter {
      case (_, timestamp, _) => timestamp >= startTime && timestamp <= endTime
    }

    // Map and aggregate data
    val aggregatedDataRDD = filteredDataRDD.map {
      case (sensor_id, _, value) => (sensor_id, (value, 1))
    }.aggregateByKey((0.0, 0))(
      (acc, valueCount) => (acc._1 + valueCount._1, acc._2 + valueCount._2),
      (acc1, acc2) => (acc1._1 + acc2._1, acc1._2 + acc2._2)
    )

    // Calculate averages
    val averageDataRDD = aggregatedDataRDD.map {
      case (sensor_id, (totalValue, totalCount)) => (sensor_id, totalValue / totalCount)
    }

    // Print the average values for each sensor
    averageDataRDD.foreach { case (sensor_id, averageValue) =>
      println(s"Sensor $sensor_id: Average Value = $averageValue")
    }

    sc.stop()
  }
}
*/
