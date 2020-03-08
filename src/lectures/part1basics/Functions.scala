package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def aFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("HELLO", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello", 5))

  //When you need loop, use recursion.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  def greeting(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old."

  println(greeting("Fatih", 25))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  //recursive functions return types must be declared explicitly because compiler cannot infer recursive parts type by itself.

  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  //1 1 2 3 5 8 ...
  println(fibonacci(8))

  def testIfPrime(n: Int): Boolean = {
    @tailrec
    def divideNumberRecursive(divider: Int): Boolean = {
      if (divider >= n - 1) true
      else (n % divider != 0) && divideNumberRecursive(divider + 1)
    }

    divideNumberRecursive(2)
  }

  private val isPrime: Boolean = testIfPrime(2003)
  println(isPrime)
}
