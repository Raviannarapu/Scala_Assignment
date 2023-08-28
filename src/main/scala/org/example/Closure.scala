/*
//package org.example

object Closure {
  def main(args: Array[String]): Unit = {
    //val basenumber = 10

   /* val add: Int => Int = (X: Int) => X + basenumber

    val result = add(10)

    println("Result: " + result)*/


    val multuplier: Int => Int ={
      val factor = 5
      (X: Int) => X * factor}

    println(multuplier(3))

  }

}//
*/
