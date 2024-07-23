object q03 {
  def calculateSphereVolume(radius: Double): Double = {
    val pi = math.Pi
    (4.0 / 3.0) * pi * math.pow(radius, 3)
  }

  def main(args: Array[String]) = {
    val sphereRadius = 5.0
    val volume = calculateSphereVolume(sphereRadius)
    println(
      s"The volume of a sphere with radius $sphereRadius is  $volume cubic units"
    )
  }
}
