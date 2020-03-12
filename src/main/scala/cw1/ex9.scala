package cw1

object ex9 {
  def main(args: Array[String]):Unit ={
    var list: List[Int] = List(1, 2, 3, 4, 5, 6)
    print(increase(list))
  }

  def increase(list: List[Int]):List[Int]={
    val afterDiscount = list.map(a => a + 1)
    return afterDiscount
  }


}
