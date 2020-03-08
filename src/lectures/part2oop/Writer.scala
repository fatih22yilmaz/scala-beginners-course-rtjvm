package lectures.part2oop

class Writer(val firstName: String, val surname: String, val birthYear: Int) {

  def fullName(): String = s"$firstName $surname"

}
