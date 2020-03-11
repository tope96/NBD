package cw1

object ex5 {
  def main(args: Array[String]):Unit={
    val products = Map("chleb" -> 5, "maslo" -> 10, "woda" -> 3)

    print("a) ")
    println(makeDiscount(products))
  }

  def makeDiscount(products: Map[String, Int]):Map[String, Double] ={
    val afterDiscount = products.map({case(product, price) => product -> price * 0.9});
    return afterDiscount;
  }
}
