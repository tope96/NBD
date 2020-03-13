package cw1

object ex3 {
  def main(args: Array[String]):Unit={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

    print(getDays(days))
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
}
