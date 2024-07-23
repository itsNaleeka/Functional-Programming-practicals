object RunningTimeCalculator {
  def main(args: Array[String]) = {
    val easyPaceDistance = 2
    val tempoDistance = 3
    val easyPaceTime = 8
    val tempoTime = 7

    val easyPaceTotalTime = easyPaceDistance * easyPaceTime
    val tempoTotalTime = tempoDistance * tempoTime

    val totalRunningTime = easyPaceTotalTime + tempoTotalTime

    println(s"Total running time: $totalRunningTime minutes")
  }
}
