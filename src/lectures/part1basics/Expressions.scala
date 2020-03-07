package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // 1 + 3 is an EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=  ....... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  // Its not like if condition set variable, it is like if condition variable is...
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  } // Never write again

  //Everything in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code block

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  } //code block is an expression and the value of the block is the last line of the block.

  //val anotherValue = z + 1 outside of the block

  //TAKEAVAYS
//  Basic expressions: operators
//  If in Scala is an expression
//  Code blocks in Scala are expressions
//    the value of the block is the value of its last expression
//  Expressions vs. instructions
//    instructions are executed(think Java), expressions are evaluated(Scala)

}
