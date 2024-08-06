object SquareCal {

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)  // Lambda function num => num * num
  }

  def main(args: Array[String]): Unit = {
    // Example usage:
    val input = List(1, 2, 3, 4, 5)
    val output = calculateSquare(input)

    println(s"Input: $input")  // Input: List(1, 2, 3, 4, 5)
    println(s"Output: $output") // Output: List(1, 4, 9, 16, 25)
  }
}

// In Scala, a lambda function is an anonymous function that is typically passed as an argument to 
// higher-order functions like map and filter. 
// The lambda function used here is num => num * num, which calculates the square of a given number.