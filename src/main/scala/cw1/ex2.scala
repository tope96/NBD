package cw1

object ex2 {
  def main(args: Array[String])={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

    print("a) ")
    println(getDays(days))

    print("b) ")
    println(getDaysReverse(days))
  }

  def getDays(myList:List[String]):String={
    var separator = ", "
    if(myList.nonEmpty) {
      if(myList.tail.isEmpty){
        separator = ""
      }
      return myList.head + separator + getDays(myList.tail)
    }
    return ""
  }

  def getDaysReverse(myList:List[String]):String= myList match{
    case myList: List[String] if myList.tail.isEmpty => myList.head
    case _ => getDaysReverse(myList.tail) + ", " + myList.head
  }
}
