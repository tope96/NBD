package cw1

object ex7 {
  val products = Map("chleb" -> 5.0, "maslo" -> 10.0, "woda" -> 3.0)

  def main(args: Array[String]):Unit={
    println(getPrice("maslo"))
    println(getPrice("bulka"))
  }

  def getPrice(product: String):Any={
    products.getOrElse(product, "Brak informacji")
  }
}
