package cw1

object ex5 {
  def main(args: Array[String]):Unit={
    val products = Map("chleb" -> 5.0, "maslo" -> 10.0, "woda" -> 3.0)

    print("a) ")
    println(makeDiscount(products))
  }

  def makeDiscount(products: Map[String, Double]):Map[String, Double] ={
    products.map({case(product, price) => product -> price * 0.9});
  }
}
