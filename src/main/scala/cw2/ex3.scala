package cw2

object ex3 {
  def main(args: Array[String]):Unit={
    val osoba1 = new Osoba("Tomasz", "Pietrzak")
    val osoba2 = new Osoba("Anna", "Nowak")
    val osoba3 = new Osoba("Krzysztof", "Iksinski")

    println(przywitanie(osoba1))
    println(przywitanie(osoba2))
    println(przywitanie(osoba3))
  }

  def przywitanie(osoba: Osoba): String = osoba match{
    case Osoba(_, "Pietrzak") => "Witam, Panie Pietrzak"
    case Osoba("Anna", _) => "Witaj, Aniu"
    case _ => "Witaj, " + osoba.imie + " " + osoba.nazwisko
  }
}

case class Osoba(private var _imie: String, private var _nazwisko: String){
  def imie: String = _imie
  def nazwisko: String = _nazwisko
}