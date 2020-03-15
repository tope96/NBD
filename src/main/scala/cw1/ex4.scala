package cw1

object ex4 {
  def main(args: Array[String]): Unit={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

    print("a) ")
    println(left(days))

    print("b) ")
    println(right(days))

    print("c) ")
    println(leftWithP(days))
  }

  def left(myList: List[String]): String={
    myList.tail.foldLeft(myList.head)((a, b) => a + ", " + b )
  }

  def right(myList: List[String]): String={
    myList.foldRight("")((a, b) => if (b.isEmpty) a else a + ", " + b)
  }

  def leftWithP(myList: List[String]): String={
    myList.tail.foldLeft(myList.head) { (element, input) => if (input.startsWith("P")) element + ", " + input  else element }
  }


}
