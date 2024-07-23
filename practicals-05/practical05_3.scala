import scala.io.StdIn

object Fibonacci {
  // Recursive function to calculate the nth Fibonacci number
  def fibonacci(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  // Function to print the first n Fibonacci numbers
  def printFibonacciNumbers(n: Int): Unit = {
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the value of n:")
    val n = StdIn.readInt()
    printFibonacciNumbers(n)
  }
}
