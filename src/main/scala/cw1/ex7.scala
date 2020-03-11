package cw1

object ex7 {
  val products = Map("chleb" -> 5, "maslo" -> 10, "woda" -> 3)

  def main(args: Array[String]):Unit={
    print(getPrice("maslo"))
  }

  def getPrice(product: String):Any={
    val price = products.getOrElse(product, "Brak informacji")
    return price
  }
}
