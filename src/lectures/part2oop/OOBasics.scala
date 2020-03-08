package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 28)
  val person2 = new Person2("John", 28)
  //println(person.age) //complains because class parameters are not FIELDS
  // to convert class parameters to class fields we must provide (val or var) keyword before declaring them.
  println(person2.age)
  println(person2.x)
  person2.greet("Daniel")

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.incrementCount(10).print()

  //TAKEAWAYS
  // Defining classes
  // Instantiating
  // Parameters vs Fields
  // Defining methods
  // Calling methods
  //   calling methods without paranthesis is allowed for only parameterless methods
  // The keyword this
}

// Constructor
class Person(name: String, age: Int)

// Constructor
class Person2(name: String, val age: Int = 0) { //Default parameters are works for constructors as well.
  //Body of the class
  // In the body of a class expressions can be written and Instantiation phase runs them
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says Hi, $name")

  //Overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //Multiple constructors or overloading constructors
  def this(name: String) = this(name, 0) // when overloading constructors implemenatation must call the default constructor,
  //this makes overloading constructors impractical because they do nothing more than calling default constructors with initial values
  //Because this can be achieved with default parameters constructor overlading is not practical.
}