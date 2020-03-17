package cw2.ex5

abstract class Osoba(private var _imie: String, private var _nazwisko: String){
  def imie: String = _imie
  def nazwisko: String = _nazwisko
  def podatek: Double


}