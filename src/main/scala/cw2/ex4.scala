package cw2

object ex4 {
  def main(args: Array[String]): Unit = {
    println(func(x => x * x, 2))
  }

  def func(f: Int => Int, a: Int): Int = f(f(f(a)))

}