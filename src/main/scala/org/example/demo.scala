/*
package org.example

object demo {

  def main(args: Array[String]): Unit = {


//  println("enter the size");
//  val size=scala.io.StdIn.readInt()
//  println("the value u have entered is ",size)
//
//  //creating a dynamic array
//
//  val arr=new Array[Int](size)    //---------10 *4=40 bytes
//
//  //how to insert data into dynamic array
//
//  for(i<-0 until size){
//
//    println("enter the element at ith index",i)
//    arr(i)=scala.io.StdIn.readInt()
//  }


//  for (i <- 0 until size) {
//if(arr(i)%2==0)
//    println(arr(i))
//    for(i <-0 until size){
//      if(i%2==1)
//        println(arr(i), i)
//  }


    val numbers: Array[Int] = Array(5, 3, 1, 4, 2)
    numbers.foreach(println) // Print all elements
    val squaredNumbers: Array[Int] = numbers.map(number => number * number) // Square each element
    val filteredNumbers: Array[Int] = numbers.filter(_ % 2 == 0) // Filter even numbers
    val sortedNumbers: Array[Int] = numbers.sortBy(number => -number) // Sort in descending order
    println(squaredNumbers)
    println(filteredNumbers)
    println(sortedNumbers)

    val list: List[Int] = List(1, 2, 3, 4, 5)
    // Iterating over elements using foreach
    list.foreach(println)
    // Transforming elements using map
    val doubledList: List[Int] = list.map(_ * 2)
    // Filtering elements based on a condition
    val filteredList: List[Int] = list.filter(_ > 2)
    // Folding elements using fold
    val sum: Int = list.fold(0)(_ + _)
    // Reversing the list
    val reversedList: List[Int] = list.reverse


}

}
*/
