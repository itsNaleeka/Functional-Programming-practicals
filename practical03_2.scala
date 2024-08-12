object LongerStrings{
def filterLongStrings(strings: List[String]): List[String] = {
  strings.filter(_.length > 5)
}

def main(args: Array[String]): Unit = {

  var inputStrings: List[String] = List("Parrot", "Tiger", "chimp", "snakes" , "elephant" )


  val filteredStrings = filterLongStrings(inputStrings)
  println("Filtered strings longer than 5 characters:")
  filteredStrings.foreach(println)
}
}