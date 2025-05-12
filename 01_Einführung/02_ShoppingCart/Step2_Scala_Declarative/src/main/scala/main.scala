@main def run(): Unit = {
  var cart = List[String]()

  def addItem(cart: List[String], item: String): List[String] = cart :+ item
  def removeItem(cart: List[String], item: String): List[String] = cart.filterNot(_ == item)

  def getDiscountPercentage(cart: List[String]): Double =
    if cart.exists(_.toLowerCase.contains("buch")) then 5.0 else 0.0

  cart = addItem(cart, "Buch: Scala lernen")
  cart = addItem(cart, "Apfel")
  cart = addItem(cart, "Milch")

  println(s"Warenkorb: $cart")
  println(s"Rabatt: ${getDiscountPercentage(cart)}%")

  cart = removeItem(cart, "Buch: Scala lernen")
  println("Buch: Scala lernen wurde entfernt")

  println(s"Warenkorb: $cart")
  println(s"Rabatt: ${getDiscountPercentage(cart)}%")
}
