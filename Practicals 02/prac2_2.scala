object App {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    val k = 4.3f

    println(-(-b) * a + c * d - (-c))

    println({ a += 1; a })

    val g: Float = 4.0f
    println(-2 * (g - k) + c)

    println({ c += 1; c });

    print({ c += 1; a += 1; c * a })

  }
}
