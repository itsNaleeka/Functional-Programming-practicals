object StringReversal {
  def reverse(s: String): String = {
    if (s.isEmpty) ""
    else reverse(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = {
    print("enter the string : ")
    val originalString= scala.io.StdIn.readLine()
    println(originalString)
    val reversedString = reverse(originalString)
    println(reversedString) // Outputs is the reversed code 
  }
}
