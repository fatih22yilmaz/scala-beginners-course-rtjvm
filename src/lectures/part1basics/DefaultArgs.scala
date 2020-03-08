package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  println(trFact(10))

  def savePicture(format: String = "jpg", width: Int, height: Int): Unit = println("Picture saved!")

  savePicture(width = 800, height = 600)

  /*
  * 1. pass in every leading argument
  * 2. name the arguments
  */

  // When 99% of time we call a function with the same params:
  //    we can give them default values
  //    to overcome confusion of the compiler we can name our arguments when we provide them
  //    this comes with side feature of being able to call methods with different orders by providing their names.
  //    or we can just provide all arguments in default order to overcome confusion.

}
