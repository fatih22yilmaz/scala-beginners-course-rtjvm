package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorialRecursive(n: Int): Int = {
    if (n < 1) 1
    else {
      println(s"Computing factorial of: $n - I fist need factorial of: ${n - 1}")
      val result = n * factorialRecursive(n - 1)
      println(s"Computed factorial of: $n result is: $result")
      result
    }
  }

  @tailrec
  def factorialTailRecursive(n: Int, y: Int): Int = {
    if (n < 1) y
    else {
      println(s"Computing factorial of: $n - I fist need factorial of: ${n - 1}")
      val result = y * n
      factorialTailRecursive(n - 1, result)
    }
  }

  def factorialTailRecursiveWithAuxilaryFunction(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x < 1) accumulator
      else factorialHelper(x - 1, accumulator * x) // TAIL RECURSION = use recursive call as the LAST expression
    }

    factorialHelper(n, 1)
  }

  //println(factorialRecursive(9))
  //println(factorialTailRecursive(9, 1))
  //println(factorialTailRecursiveWithAuxilaryFunction(20000))
  //WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  def stringConcatenate(small: String, n: Int) = {
    def concatenateHelper(big: String, x: Int): String = {
      if (x <= 1) big
      else concatenateHelper(big + " " + small, x - 1)
    }

    concatenateHelper(small, n)
  }

  //println(stringConcatenate("Hello", 5))

  def isPrime(n: Int) = {
    @tailrec
    def isPrimeHelper(x: Int, isPrime: Boolean): Boolean = {
      if (isPrime || x >= n) !isPrime
      else isPrimeHelper(x + 1, (n % x) == 0)
    }

    isPrimeHelper(2, isPrime = false)
  }

  println(isPrime(9))

  def fibonacci(n: Int) = {
    def fibonacciHelper(x: Int, previous: Int, previous2: Int): Int = {
      if (x <= 2) previous + previous2
      else fibonacciHelper(x - 1, previous + previous2, previous)
    }

    fibonacciHelper(n, 1, 0)
  }

  //println(fibonacci(5))
}
