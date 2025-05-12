object TipCalculator:
  def getTipPercentage(names: List[String]): Int =
    if names.isEmpty then 0
    else if names.size > 5 then 20
    else 10

@main def run(): Unit =
  val group1 = List("Anna", "Ben", "Clara")
  val group2 = List("Max", "Lea", "Tom", "Lena", "Nina", "Paul")
  val group3 = List()

  println(s"Gruppe 1 (${group1.size} Personen): ${TipCalculator.getTipPercentage(group1)}% Trinkgeld")
  println(s"Gruppe 2 (${group2.size} Personen): ${TipCalculator.getTipPercentage(group2)}% Trinkgeld")
  println(s"Gruppe 3 (${group3.size} Personen): ${TipCalculator.getTipPercentage(group3)}% Trinkgeld")