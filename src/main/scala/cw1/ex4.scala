package cw1

object ex4 {
  def main(args: Array[String]): Unit={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

    print("a) ")
    println(left(days))
  }

  def left(myList: List[String]): String={
    val stringList = myList.tail.foldLeft(myList.head)((a, b) => a+ ", " + b )
    return stringList
  }

}
