package cw1

object ex10 {
  def main(args: Array[String]):Unit={
    val list: List[Int] = List(1, 2, 3, 4, -3, -10)
    print(absoluteValue(list))
  }

  def absoluteValue(list: List[Int]):List[Int]={
    return list.filter(x => -5 <= x && x <= 12).map(a => a.abs)
  }
}
