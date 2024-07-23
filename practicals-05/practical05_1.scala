import scala.io.StdIn

object InventoryManagementSystem {
  def getProductList: List[String] = {
    def loop(accumulatedList: List[String]): List[String] = {
      val input = StdIn.readLine("Enter a product name (or 'done' to finish): ")
      if (input.toLowerCase == "done") accumulatedList.reverse
      else loop(input :: accumulatedList)
    }

    loop(Nil)
  }

  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(products: List[String]): Int = products.length

  def main(args: Array[String]): Unit = {
    val productList = getProductList
    printProductList(productList)
    val totalProducts = getTotalProducts(productList)
    println(s"Total products entered: $totalProducts")
  }
}
