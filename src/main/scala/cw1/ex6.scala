package cw1

object ex6 {
  def main(args: Array[String]):Unit={
    val tuple = Tuple3(2, "Test", 0.3)
    getTuple(tuple)
  }

  def getTuple(myTuple: (Int, String, Double)):Unit={
    print(myTuple._1 + ", " + myTuple._2 + ", " + myTuple._3)
  }
}
