object q04 {
  def main(args: Array[String]) = {
    def calculateDiscountedPrice(
        coverPrice: Double,
        discount: Double
    ): Double = {
      coverPrice * (1 - discount)
    }

    def calculateShippingCost(totalUnits: Int): Double = {
      val firstCopyShipping = 3.0
      val additionalCopyShipping = 0.75
      firstCopyShipping + (additionalCopyShipping * (totalUnits - 1))
    }

    def calculateTotalWholesaleCost(totalUnits: Int): Double = {
      val coverPrice = 24.95
      val discount = 0.4
      val discountedPrice = calculateDiscountedPrice(coverPrice, discount)
      val shippingCost = calculateShippingCost(totalUnits)
      discountedPrice * totalUnits + shippingCost
    }

    val totalUnits = 60
    val totalCost = calculateTotalWholesaleCost(totalUnits)
    println(
      s"The total wholesale cost for $totalUnits copies is Rs. $totalCost"
    )
  }
}
