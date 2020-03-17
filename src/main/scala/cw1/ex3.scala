package cw1

object ex3 {
  def main(args: Array[String]):Unit={
    val days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

    print("a) ")
    println(getDays(days, ""))
  }

  def getDays(list: List[String], text: String): String = list match {
    case Nil => ""
    case h :: t =>
      if (t.isEmpty) text + ", " + h
      else if (text.isEmpty) getDays(t, h)
      else getDays(t, text + ", " + h)
  }
}
