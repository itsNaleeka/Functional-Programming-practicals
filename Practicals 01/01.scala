object q01 {
  def main(args: Array[String]): Unit = {
    def calculateDiskArea(radius: Double): Double = {
      val pi = math.Pi
      pi * radius * radius
    }

    val radius = 5.0
    val area = calculateDiskArea(radius)
    println(s"The area of a disk with radius $radius is $area")
  }
  {
    def calculateDiskArea(radius: Double): Double = {
      val pi = math.Pi
      pi * radius * radius
    }

    val radius = 5.0
    val area = calculateDiskArea(radius)
    println(s"The area of a disk with radius $radius is $area")
  }
}