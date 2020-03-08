package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = this.favoriteMovie == movie

    def +(other: Person): String = s"${this.name} is hanging out with ${other.name}"

    def unary_! = println(s"${this.name} What the heck")

    def isAlive = true

    def apply(): String = s"Hi, my name is $name and I like the movie $favoriteMovie"

    //1
    def +(nickname: String): Person = new Person(s"${this.name} ($nickname)", this.favoriteMovie)

    //2
    def unary_+ : Person = new Person(this.name, this.favoriteMovie, this.age + 1)

    //3
    def learns(lesson: String): String = s"$name is learning $lesson"

    def learnsScala: String = this learns "Scala"

    //4
    def apply(times: Int): String = s"$name watches $favoriteMovie, $times times."
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // Both are equivalent
  // Its called Infix notation or operator notation (Syntactic sugar)
  //It works only single parameter methods.

  val tom = new Person("Tom", "About Time")
  println(mary + tom)
  //In scala one can name methods with operators
  println(tom.+(tom))

  // So actual operators of math are simply methods of the beholding classes.

  println(1 + 2)
  println(1.+(2)) // are the same

  // ALL OPERATORS ARE METHODS

  //prefix notation
  val x = -1
  val y = 1.unary_-
  println(x.==(y))
  //unary_prefix only works with - + ~ !
  !tom
  tom.unary_!

  //postfix notation
  println(tom isAlive)
  println(tom.isAlive)
  // is only available methods with no arguments

  // apply
  println(mary.apply())
  println(mary()) // are the same because of the apply method.f

  //Exercises

  //1
  println((tom + "superman").name)
  println((tom + "superman") ())
  println((tom + "superman").apply())

  //2
  println((+mary).age)

  //3
  println(mary learnsScala)

  //4
  println(mary(4))


  //Takeaways
  // Infix notation => object method parameter
  //    for methods with one parameter

  //prefix notation unary_+
  //    only works for + - ~ ! and accepts no parameter

  //postfix notation => object method
  //    for methods with no parameter
  //    rarely used because of confusion

  //apply method is a special method that can be called by objects name with parantheses
  // mary()
}
