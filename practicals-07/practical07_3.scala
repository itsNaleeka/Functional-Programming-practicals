object PrimeFilter {

  def isPrime(num: Int): Boolean = {
    if (num <= 1) {
      false
    } else {
      !(2 until num).exists(i => num % i == 0)
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    // Example usage:
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val output = filterPrime(input)

    println(s"Input: $input")  // Input: List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(s"Output: $output") // Output: List(2, 3, 5, 7)
  }
}
