object WordScorer:
	private def scoreWord(word: String): Int =
		word.count(c => c != 'a' && c != 'A')

	def sortWordsByScore(words: List[String]): List[(String, Int)] =
		words.map(w => (w, scoreWord(w))).sortBy(-_._2)

@main def runWordScorer(): Unit =
	val words = List("Apfel", "Banane", "Zitrone", "Traube")
	val scored = WordScorer.sortWordsByScore(words)
	println("Wörter nach Score sortiert:")
	scored.foreach { case (word, score) => println(s"$word -> $score Punkte") }
