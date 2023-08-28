/*
/*

package org.example.Demo.Sbclass

object Currying_function {
  def main(args: Array[String]): Unit = {
    // Regular non-curried function that takes two arguments and returns their sum
    def add(a: Int,b:Int):Int = a+b
    // Curried version of the same function
    def curriedAdd(a: Int)(b:Int):Int = a+b
    // Usage of the curried function
   val result = curriedAdd(10)(3)
    println(result)

  }

}

*/

object PrimeNumberFinder {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false

    var i = 3
    while (i * i <= n) {
      if (n % i == 0) return false
      i += 2
    }
    return true
  }

  def findPrimes(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val l = List(29, 7, 23, 15, 10)
    val primes = findPrimes(l)
    println("Prime numbers in the list: " + primes.mkString(", "))
  }
}

*/
