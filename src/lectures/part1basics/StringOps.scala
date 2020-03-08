package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  str.split(" ").foreach(println)
  println(str.startsWith("Hello"))
  println(str.replace("I am", "you are"))
  println(str.toLowerCase)
  println(str.length)

  val aNumberString: String = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific: String interpolators

  // S-interpolators
  val name = "Fatih"
  val age = 25
  val greeting = s"Hello, my name is $name and I am $age years old!"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old!"

  println(greeting)
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2F
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"

  println(myth)
  // For formatted strings, we use f interpolators, it can be used after inserting a percent(%) sign
  // Its rules are the same as printf rules.
  // also f interpolators can be used for type checks

  //  val x = 1.1f
  //  val checkedX = f"$x%3d"

  // raw-interpolators
  println(raw"This is a \n new line")
  val escaped = "This is a \n new line"
  println(raw"$escaped")

}
