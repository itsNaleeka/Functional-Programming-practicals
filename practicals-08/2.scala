object TakeInputs {
    def main(args: Array[String]): Unit = {
        print("Enter a number: ")
        val input = scala.io.StdIn.readLine().toInt

        val check:Int => String = {
            case n if (n % 3 == 0 && n % 5 == 0) => "Multiple of Both Three and Five"
            case n if (n % 3 == 0) => "Multiple of Three"
            case n if (n % 5 == 0) => "Multiple of Five"
            case _ => "Not a Multiple of Three or Five"
        }

        println(check(input))
    }
}