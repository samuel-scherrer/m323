object TravelPlanner:
	def addDestination(route: List[String], destination: String): List[String] =
		val newRoute = route :+ destination
		println(s"Reiseziele (new Destination added): $newRoute")
		newRoute

	def updateDestination(route: List[String], oldDest: String, newDest: String): List[String] =
		val newRoute = route.map(dest => if dest == oldDest then newDest else dest)
		println(s"Reiseziele (updated Destination to other one): $newRoute")
		newRoute

@main def runTravelPlanner(): Unit =
	val route = List("Paris", "Berlin")
	println(s"Reiseziele (Anfangsroute): $route")

	val updatedRoute = TravelPlanner.addDestination(route, "Rom")
	val finalRoute = TravelPlanner.updateDestination(updatedRoute, "Berlin", "Madrid")
