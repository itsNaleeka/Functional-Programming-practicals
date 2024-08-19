object PatternMatching {
    def main(args: Array[String]): Unit = {
        print("Please enter a number")
        val input = scala.io.StdIn.readInt()

        val result = input match {
            case input if input <= 0 => "Zero/Negative number"
            case input if input % 2 == 0 => "an Even number"
            case _  => "an Odd number"
        }
        println(s"${input} is ${result}")
    }
}