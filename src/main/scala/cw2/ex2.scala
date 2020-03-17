package cw2

object ex2 {
  def main(args: Array[String]):Unit={
    val konto1 = new KontoBankowe(20.0)
    println(konto1.stanKonta)
    konto1.wplata(20.00)
    println(konto1.stanKonta)
    konto1.wyplata(10.0)
    println(konto1.stanKonta)
  }
}


class KontoBankowe(private var _stanKonta: Double) {

  def this(){
    this(_stanKonta = 0.0)
  }

  def stanKonta: Double = _stanKonta

  def wyplata(ilosc: Double):Unit={
    if(_stanKonta-ilosc < 0 || ilosc == 0){
      throw new Exception("Niepoprawna kwota wyplaty")
    }else{
      _stanKonta = _stanKonta-ilosc
    }
  }

  def wplata(ilosc: Double):Unit={
    if(ilosc > 0){
      _stanKonta = ilosc + _stanKonta
    }else{
      throw new Exception("Kwota nie moze byc ujemna")
    }
  }
}
