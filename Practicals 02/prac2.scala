object app {
  def main(args: Array[String]): Unit = {
    {
      val i, j, k: Int = 2
      val m, n: Int = 5
      val f: Double = 12.0
      val g: Double = 4.0
      val c: Char = 'X'

      val resultA = k + 12 * m
      val resultB = m / j
      val resultC = n % j
      val resultD = m / j * j
      val resultE = f + 10 * 5 + g
      val resultF = (i + 1) * n

      println(s"Result A: $resultA")
      println(s"Result B: $resultB")
      println(s"Result C: $resultC")
      println(s"Result D: $resultD")
      println(s"Result E: $resultE")
      println(s"Result F: $resultF")
    }

  }
}
