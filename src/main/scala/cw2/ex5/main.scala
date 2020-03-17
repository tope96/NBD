package cw2.ex5

object main {
  def main(args: Array[String]):Unit={
    val student = new Osoba("A", "A") with Student

    val nauczyciel = new Osoba("A", "A") with Nauczyciel
    nauczyciel.pensja_(1000)

    val pracownik = new Osoba("A", "A") with Pracownik
    pracownik.pensja_(1000)

    val studentPraca = new Osoba("A", "A") with Student with Pracownik
    studentPraca.pensja_(1000)

    val studentPraca2 = new Osoba("A", "A") with Pracownik with Student
    studentPraca2.pensja_(1000)

    val studentNauczyciel = new Osoba("A", "A") with Student with Nauczyciel
    studentNauczyciel.pensja_(1000)

    println("Student. Podatek: " + student.podatek)
    println("Nauczyciel. Podatek: " + nauczyciel.podatek)
    println("Pracownik. Podatek: " + pracownik.podatek)
    println("Pracujacy student. Podatek: " + studentPraca.podatek)
    println("Pracujacy student2. Podatek: " + studentPraca2.podatek)
    println("Student nauczyciel. Podatek: " + studentNauczyciel.podatek)
  }
}
