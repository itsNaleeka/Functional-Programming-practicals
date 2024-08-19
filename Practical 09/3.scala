object FormatString {
    def toUpper(text:String):String = {
        text.toUpperCase()
    }
    def toLower(text:String):String = {
        text.toLowerCase()
    }
    def formatNames(name:String, f:String => String):String = {
        f(name)
    }

    def main(args: Array[String]):Unit = {
        val text = "sample strIng Test"
        val upperCaseText = toUpper(text)
        val lowerCaseText = toLower(text)

        println(s"Original text : $text")
        println(s"Uppercase text : $upperCaseText")
        println(s"Lowercase text : $lowerCaseText")

        val name1 = formatNames("Benny", toUpper)
        val name2 = formatNames("Niroshan", toLower)
        val name3 = formatNames("Saman", toLower)
        val name4 = formatNames("Kumara", toUpper)
        println(name1)
        println(name2)
        println(name3)
        println(name4)

    }
}