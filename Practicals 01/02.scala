object q02 {
  def celsiusToFahrenheit(celsius: Double): Double = {
    val fahrenheit = (celsius * 1.8) + 32
    fahrenheit
  }

  def main(args: Array[String]): Unit = {
    val celsiusValue = 35.0
    val fahrenheitValue = celsiusToFahrenheit(celsiusValue)
    println(s"$celsiusValue°C is approximately equal to $fahrenheitValue°F")
  }
}