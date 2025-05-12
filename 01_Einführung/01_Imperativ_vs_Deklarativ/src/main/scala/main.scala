@main
def main(): Unit =
  def calculateScore_imperative(word: String): Int =
    var score = 0
    for c <- word do
      if c != 'a' then score += 1
    score

  def wordScore_declarative(word: String): Int =
    word.count(_ != 'a')

  println(calculateScore_imperative("imperative"))   // 9
  println(calculateScore_imperative("no"))           // 2
  println(wordScore_declarative("declarative"))      // 9
  println(wordScore_declarative("yes"))              // 3