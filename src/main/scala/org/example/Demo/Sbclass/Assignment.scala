


package org.example.Demo.Sbclass

object Assignment {
  def main(args: Array[String]): Unit = {


  }
  /*  //1.Write a program to convert kg to g. (Input 56kg print in grams)

  //input-weight in kilogram
  val WeightInKilogram = 56
  //convert 1 kg to 1000kgrm
  val Convert = 1000

  val weightInGrms = WeightInKilogram * Convert

  println(s"$WeightInKilogram kg is $weightInGrms grms.")

  //2. Write a program to covert temperature from degree C to F. (Input 80C)-(80°C × 9/5) + 32 = 176°F

  //input
  val TemparatureInDegree = 80.0
  //convert c to f
  val concert = (80 * 9 / 5) + 32

  println(s"$TemparatureInDegree c is $concert F.")

  //3.Declare and initialize 3 three variable and print the biggest number

  val num1 = 15
  val num2 = 30
  val num3 = 45

  //find Biggest number using max
  val BiggerNumber = Seq(num1, num2, num3).max
  println(s"The Biggest Number amoung $num1,$num2,$num3 is $BiggerNumber")*/

  /*  //4. Write a java program that performs the following tasks.

  val scanner = new java.util.Scanner(System.in)
  // Step a: Store a number in a variable

  //val number = 433
  print("Enter a number:")
  //val number = scanner.nextInt()

  // Step b: Check if the value is in the range (100-1000)
  if (number >= 100 && number <= 1000) {
    println("Valid number!")

    // Step c: Check even or odd
    if (number % 2 == 0) {
      println("The number is even.")

      // Step d: If even, divide by 3 and print remainder
      val remainder = number % 3
      println(s"Remainder when divided by 3: $remainder")
    } else {
      println("The number is odd.")

      // Step e: If odd, divide by 2 and print remainder
      val remainder = number % 2
      println(s"Remainder when divided by 2: $remainder")
    }

  } else {
    println("Wrong number! Please enter a number between 100 and 1000.")
  }

  scanner.close()*/

  //5. Declare & initialize a number. Check whether the number is in range 0-100 or not.
  // If not in range print invalid input. Else – if the number is in range
  // 90-100 then print Super Smart,
  // 80-90 print Smart,
  // 70-80 print smart enough,
  //60-70 print just smart,
  // 35-60 print no smart,
  // 0-35 print dump.
  /*val number = 66

  if (number >= 0 && number <= 100) {
    if (number >= 90 && number <= 100) {
      println("Super Smart")
    } else if (number >= 80 && number < 90) {
      println("Smart")
    } else if (number >= 70 && number < 80) {
      println("Smart enough")
    } else if (number >= 60 && number < 70) {
      println("Just smart")
    } else if (number >= 35 && number < 60) {
      println("No smart")
    } else if (number >= 0 && number < 35) {
      println("Dumb")
    }
  } else {
    println("Invalid input. Number must be in the range 0-100.")
  }
}*/
  //6,Write a program to perform simple math based on the user inputs by using Switch condition.(+ , - , * , /).
  /*val scanner = new java.util.Scanner(System.in)

  // Input: Two numbers and an operator
  print("Enter the first number: 100 ")
  val num1 = scanner.nextDouble()

  print("Enter the second number: 20")
  val num2 = scanner.nextDouble()

  print("Enter the operator (+, -, *, /): ")
  val operator = scanner.next()

  // Perform calculations based on the operator
  val result = operator match {
    case "+" => num1 + num2
    case "-" => num1 - num2
    case "*" => num1 * num2
    case "/" =>
      if (num2 != 0) num1 / num2
      else {
        println("Division by zero is not allowed.")

      }
    case _ =>
      println("Invalid operator.")

  }

  // Print the result
  println(s"Result: $result")

  scanner.close()
}*/

  //7.Write a program to print “SEEKHO BIGDATA”for 60 times.
  /*for (_ <- 1 to 60) {
  println("SEEKHO BIGDATA")
}
}*/

  /*//8.Write a program to print all numbers which are divisible by 11 from 250 to 550.
for (num <- 250 to 500)
  if(num % 11 == 0){
  println(num)
  }
}*/

  /*//9.Write a program to sum all the numbers from 56 to 153.
val start = 56
  val end = 153
var sum = 0
  for (num <- start to end){
  sum += num
  }
  println(s"The sum of the numbers from $start to $end is: $sum")
}*/

  //10.Write a program to print all even numbers in range 700 to 900.
  /*for (num <- 700 to 900 by 2){
println(num)
}
}*/

  //11. Write a program to print all odd numbers from 251 to 51. like (251,249,...51).
  /*for (num <- 251 to 51 by -2){
println(num)
}
}*/

  //12. Write a Program to print the count of the even numbers between the given range?

  /*val start = 2
  val  end = 8
  var count = 0
  for (num <- start to end){
  if (num % 2 ==0){
    count += 1
  }
  }
  println(s"The count of even numbers between $start and $end is: $count")
}*/

  //13.Write a program to print alternate even numbers from 20 to 140. Like (20,24,28...).
  /*
  for (num <- 20 to 140 by 4) {
    println(num)
  }
}*/

  //14.Write a program to print alternate even numbers from 20 to 140. Like (22,26,30...)
  /*for (num <- 20 to 140 by 2){
println(num)
}
}*/

  //15. Print following series 2*3,3*4,4*5,......16*17 (Print in two ways – patter & multiplied value)

  //pattern value
  /*for(num <- 2 to 16){
    val nextnum = num + 1
    println(s"$num*$nextnum")
    println("series as pattern:")
  }*/
  //multiple values

  /*for (num <- 2*3 to 16*17 ){
println(num)
}
}*/

  //16.Write a program to sum all even numbers between 382 and 582.

  /*val start = 382
  val end = 582
  var sum =0
for (num <- 382 to 582){
  if (num % 2 ==0)
    sum += num
}
  println(s"The sum of even numbers between $start and $end is: $sum")
}*/

  //17. Write a Program to print the all alphabets by using character Variable?

  /*for (c <- 'a' to 'z') {
    print(c + "")
    println("Lowercase alphabets:")
    println("\n")

  }

  for (c <- 'A' to 'Z') {
    print(c + "")
    println("Uppercase alphabets:")
    println()
  }
}*/

  //18.Write a program to find the average of 24,26,28,.....100.
  /*val start = 24
  val end = 100
  val step = 2
  var sum = 0
  var count = 0
for (num <- start to end by step){
 sum += num
  count += 1
}
  val average = sum.toDouble
  println(s"The average of numbers from $start to $end with a step of $step is: $average")
}*/

  //19. Write programs to sum of the following Series. 52 + 62 + 72 +..........+1022.

  /* val FirstTerm = 52
  val lastTerm = 1052
  val commomDifference = 10

  val numTerms = (lastTerm - FirstTerm) / commomDifference + 1
  val sum = (numTerms * (FirstTerm + lastTerm)) / 2
  println(s"The sum of the series is: $sum")
}*/

  //20. Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B, A,B...)

  /*for (i <- 1 to 100){
if (i % 2 == 1){
  print("A")
}
  else{
  print("B")
}
}
}*/

  //21.Write a program to print the series :10@9,9@8,8@7........-5@-6.

  /*for (num <- 10 to -5 by -1){
println(s"$num@${num - 1}")
}
}*/

  //22. Write programs to print the following series. 100,200,300........10000.
  /*for (num <- 100 to 10000 by 100){
println(num)
}
}*/

  //23. Write programs to print the following series. 5^2, 7^2,9^2.....25^2.
  /*for (num <- 2 to 25 by 2){
val square = num * num
  println(s"$num^2 = $square")
}
}*/

  //24.Write programs to print the following series. 5,10,5,10,5,10,5 for 7 times.
  /*for (_ <- 1 to 7){
println("5")
  println("10")
}
}*/

  //25. Write programs to print the following series. 5*4,5*3,5*2,......5*(-12) (Print in two ways – patter & multiplied value)
  /*println("Series as pattern:")
for (num <- 4 to -12 by -1){
println(s"5*$num")
}
  println("\\nSeries with multiplied values:")
  for (num <- 4 to -12 by -1){
    val result = 5 * num
    println(s"5*$num = $result")
  }
}*/

  //26. Write programs to print the following series. 1,even,3,even,5,even,.......35,even

  /*  for (num <- 1 to 35 by 2) {
    if (num % 2 == 1) {
      println(num)
    } else {
      println("even")
    }
  }
}*/

  //27.Write programs to print the following series. 1,2,factor of three,4,5,factor of three, 7,8,factor of three,..........22,23,factor of three.
  /* for (num <- 1 to 23) {
    if (num % 3 == 0) {
      println("factor of three")
    } else {
      println(num)
    }
  }
}*/

  //28. Write programs to print the following series. 1,3, divisible by five, 7,9,
  //11,13, divisible by five,.....21,23, divisible by five.

 /* for (num <- 1 to 23) {
    if (num % 3 == 0) {
      println("factor of three")
    } else {
      println(num)
    }
  }
}*/

//29.Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2.

/*  for (num <- 0.5 to 5.1 by 0.2) {
    val square = num * num
    println(s"$num^2 = $square")
  }
}*/

//30. Write a for loop that never ends?

/*  while (true) {
    println("This loop will run indefinitely")
  }
}*/

//31. Write a Loop inside other loop and observe the execution flow?
/*
  for (i <- 1 to 3) {     // Outer loop
    println(s"Outer loop iteration: $i")

    for (j <- 1 to 2) { // Inner loop
      println(s"  Inner loop iteration: $j")
    }
  }
}*/









