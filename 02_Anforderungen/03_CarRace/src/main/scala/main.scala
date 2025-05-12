object RaceAnalyzer:
	private def totalRaceTime(times: List[Double]): Double =
		times.drop(1).sum

	private def averageTime(times: List[Double]): Double =
		val raceLaps = times.drop(1)
		if raceLaps.isEmpty then 0.0 else raceLaps.sum / raceLaps.length

	def runRaceAnalyzer(times: List[Double], carName: String): Unit =
		println(s"$carName:")
		println(f"Gesamte Zeit (ohne Warm-up): ${totalRaceTime(times)}%.2f Sekunden")
		println(f"Durchschnittszeit pro Runde: ${averageTime(times)}%.2f Sekunden\n")

@main def runRaceAnalyzer(): Unit =
	val lapTimes_car1 = List(75.0, 60.5, 59.3, 61.2)
	val lapTimes_car2 = List(70.0, 60.0, 55.0, 75.0)

	RaceAnalyzer.runRaceAnalyzer(lapTimes_car1, "Car 1")
	RaceAnalyzer.runRaceAnalyzer(lapTimes_car2, "Car 2")