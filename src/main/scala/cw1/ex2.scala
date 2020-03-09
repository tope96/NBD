package cw1

object ex2 {
  def main(args: Array[String])={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

    print("a) ")
    println(getDays(days, ""))

    print("b) ")
    println(getDaysReverse(days, ""))
  }

  def getDays(myList:List[String], text:String):String={
    var separator = ", "
    if(myList.nonEmpty) {
      if(myList.tail.isEmpty){
        separator = ""
      }
      return myList.head + separator + getDays(myList.tail, text)
    }
    return ""
  }

  def getDaysReverse(myList:List[String], text:String):String={
    var separator = ", "
    if(myList.nonEmpty) {
      if(myList.tail.isEmpty){
        separator = ""
      }
      return myList.reverse.head + separator + getDays(myList.reverse.tail, text)
    }
    return ""
  }
}
