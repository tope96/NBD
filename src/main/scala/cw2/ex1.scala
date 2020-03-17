package cw2

object ex1 {
  def main(args: Array[String]):Unit={
    println(whatDayIsIt("Poniedzialek"))
    println(whatDayIsIt("niedziela"))
    println(whatDayIsIt("Samochod"))
  }

  def whatDayIsIt(day: String):String = day.toLowerCase() match{
    case "poniedzialek"|"wtorek"|"sroda"|"czwartek"|"piatek" => "Praca"
    case "sobota"|"niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}
