package cw2.ex5

trait Nauczyciel extends Pracownik {
  override def podatek: Double = pensja * 0.1
}
