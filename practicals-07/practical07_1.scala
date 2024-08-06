object EvenNumberFilter {

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    // Example usage:
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterEvenNumbers(input)

    println(s"Input: $input")  // Input: List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(s"Output: $output") // Output: List(2, 4, 6, 8, 10)
  }
}


// In Scala, a lambda function is an anonymous function that is typically passed as an argument to 
// higher-order functions like map and filter. 
// The lambda function used here is num => num * num, which calculates the square of a given number.