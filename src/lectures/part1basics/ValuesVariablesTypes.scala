package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)
  //  x = 2
  //VALS ARE IMMUTABLE

  //Compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 22
  val aLong: Long = 4123423453242342342L
  val afloat: Float = 2.0F
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects

  //Takeaways
  //prefer vals over vars
  //all vals and avrs have types
  //compiler automatically infers types when ommitted
  //learned how to use basic type
  //  Boolean, Int, Long, Double, String
}
