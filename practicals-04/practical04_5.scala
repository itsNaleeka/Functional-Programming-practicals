object StringFormatter {

  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def capitalizeFirstTwo(name: String): String = {
    name.take(2).toUpperCase + name.drop(2)
  }

  def capitalizeFirstLast(name: String): String = {
    name.head.toString.toUpperCase + name.drop(1).dropRight(1) + name.last.toString.toUpperCase
  }

  def formatNames(name: String, formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Naleeka", "Sandu", "Geethika", "Pasan")

    val formattedNames = names.map { name =>
      name match {
        case "Naleeka" => name.toUpperCase 
        case "Sandu" => formatNames(name, capitalizeFirstTwo) 
        case "Geethika" => formatNames(name, toLower)  
        case "Pasan" => formatNames(name, capitalizeFirstLast) 
      }
    }

    println(formattedNames.mkString(" "))
  }
}
