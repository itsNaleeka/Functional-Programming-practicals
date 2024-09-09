class Rational(numerator: Int, denominator: Int) {
  require(denominator != 0, "Denominator cannot be zero")

  // Simplifying numerator and denominator
  private val gcdValue = Rational.gcd(numerator.abs, denominator.abs)
  val numer: Int = numerator / gcdValue
  val denom: Int = denominator / gcdValue

  // Method to negate the rational number
  def neg: Rational = new Rational(-this.numer, this.denom)

  // Subtraction method
  def subtract(that: Rational): Rational = {
    val newNumer = this.numer * that.denom - that.numer * this.denom
    val newDenom = this.denom * that.denom
    new Rational(newNumer, newDenom)
  }

  override def toString: String = s"$numer/$denom"
}

object Rational {
  // Method to compute the greatest common divisor
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

// Usage example with proper structure
object MainMethod {
  def main(args: Array[String]): Unit = {
    val rational1 = new Rational(3, 4)
    val rational2 = new Rational(5, 8)
    val rational3 = new Rational(2, 7)

    // Calculate rational1 - rational2 - rational3
    val result = rational1.subtract(rational2).subtract(rational3)
    println(result)  // Output: 13/56

    // Negate a rational number
    val negatedRational1 = rational1.neg
    println(negatedRational1)  // Output: -3/4
  }
}