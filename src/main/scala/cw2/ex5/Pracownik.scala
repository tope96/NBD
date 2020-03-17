package cw2.ex5

trait Pracownik extends Osoba {
  override def podatek: Double = pensja * 0.2
  private var _pensja: Double = _
  def pensja:Double = _pensja
  def pensja_(value:Double):Unit = _pensja = value
}
