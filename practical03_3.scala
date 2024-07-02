object AverageCalculator {
  def calculateAverage(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.0
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    print("Enter the first number: ")
    val num1 = scala.io.StdIn.readInt()
    print("Enter the second number: ")
    val num2 = scala.io.StdIn.readInt()

    val result = calculateAverage(num1, num2)
    println(f"Average: ${result}%.2f")
  }
}
