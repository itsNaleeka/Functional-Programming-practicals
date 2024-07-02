object SumofIntegers {
  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {

    var inputIntegers: List[Int] = List(1, 2, 3, 4, 5, 6)


    val result = sumOfEvenNumbers(inputIntegers)
    println(s"Sum of even numbers: $result")
  }
}
