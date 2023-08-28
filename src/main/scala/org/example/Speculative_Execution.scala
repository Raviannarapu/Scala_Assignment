/*
package org.example

object Speculative_Execution {

  val spark = SparkSession.builder()
    .appName("SpeculativeExecutionExample")
    .config("spark.speculation", "true")

    .config("spark.speculation.interval", "1000") // Check every 1 second.

    .config("spark.speculation.multiplier", "1.5") // Identify tasks slower than 1.5 times the average task duration

    .getOrCreate()

}
*/
