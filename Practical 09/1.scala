object InterestCal {
    def main(args: Array[String]): Unit = {
        val deposit = 175000

        val interestPercentage = deposit match {
            case amount if amount <= 20000 => 0.02
            case amount if amount <= 200000 => 0.04
            case amount if amount <= 2000000 => 0.035
            case _ => 0.065
        }

        println(s"Depositted amount : $deposit")
        println(s"Interest percentage : ${interestPercentage*100}%")
        println(s"Interest amount : ${deposit*interestPercentage}")
    }
}