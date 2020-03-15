package cw1

object ex8 {
  def main(args: Array[String]):Unit={
    val list:List[Int] = List(0, 1, 2, 0, 3, 2, 0, 0, 4, 0)
    print(removeZ(list, 0))
  }

  def removeZ(list: List[Int], n: Int): List[Int] = list match {
    case Nil => Nil
    case h :: t =>
    if (h == n)
      removeZ(t, n)
    else
      h :: removeZ(t, n)
  }
}
