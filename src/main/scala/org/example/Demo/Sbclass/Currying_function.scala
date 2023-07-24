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
