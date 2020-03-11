package cw1


import scala.collection.mutable.ListBuffer

object ex1 {
  def main(args: Array[String])={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

    print("a) ")
    println(getDays(days))

    print("b) ")
    println(getDaysStartsWithP(days))

    print("c) ")
    println(getDaysWithWhile(days))

  }

  def getDays(myList: List[Any]): String = {
    var text = ""
    var separator = ", "
    var iterator = 0
    if(myList.nonEmpty){
      for(element<-myList){
        if(iterator == myList.length-1){
          separator = ""
        }
        text = text + element + separator
        iterator += 1
      }
    }
    return text
  }

  def getDaysStartsWithP(myList: List[String]): String ={
    var daysStartsOnP = new ListBuffer[String]()
    if(myList.nonEmpty){
      for(element<-myList){
        if(element.startsWith("P")) {
          daysStartsOnP += element
        }
      }
      return daysStartsOnP.mkString(", ")
    }else{
      return ""
    }
  }

  def getDaysWithWhile(myList: List[String]): String={
    var text = ""
    if(myList.nonEmpty){
      val listLength = myList.length
      var iterator = 0
      var separator = ", "

      while(iterator<listLength){
        if(iterator == listLength-1){
          separator = ""
        }
        text += myList(iterator) + separator
        iterator += 1
      }
    }
    return text
  }

}

