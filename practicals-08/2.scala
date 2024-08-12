object TakeInputs {
    def main(args: Array[String]): Unit = {
        println("Enter number :")
        val input = 16

        val isDivByFive: Boolean = input % 5 == 0
        val isDivByThree: Boolean = input % 3 == 0

        if(isDivByThree && isDivByFive){
            println("Multiple of three and five")
        }
        else if(isDivByThree){
            println("Multiple of three")
        }
        else if(isDivByFive){
            println("Multiple of five")
        } else {
            println("Not a Multiple of three or five")
        }
    }
}