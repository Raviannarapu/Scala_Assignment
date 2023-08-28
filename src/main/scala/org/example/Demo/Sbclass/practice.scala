package org.example.Demo.Sbclass




  object NumberCheck {
    def main(args: Array[String]): Unit = {
      try {
        print("Enter a number: ")
        val num = scala.io.StdIn.readInt()

        // Check if the number is even
        if (num % 2 == 0) {
          println(s"$num is an even number.")
        } else {
          println(s"$num is not an even number.")
        }

        // Check if the number is divisible by 11 and 3
        if (num % 11 == 0 && num % 3 == 0) {
          println(s"$num is divisible by both 11 and 3.")
        } else {
          println(s"$num is not divisible by both 11 and 3.")
        }
      } catch {
        case _: NumberFormatException =>
          println("Invalid input. Please enter a valid number.")
      }
    }
  }



