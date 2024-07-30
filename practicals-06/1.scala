object Inventory {
  val Inventory1: Map[Int, String] = Map(001 -> "Apple" , 002 -> "Banana", 003 -> "Mango" );

  def getInventory(Inventory:Map[Int, String]) : Unit = {
    Inventory.keys.foreach { key =>
      println(Inventory(key));
    }  
  }

  def main(args: Array[String]) = {
    getInventory(Inventory1)

  }
}