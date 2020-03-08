package lectures.part2oop

class Novel(val name: String, val releaseYear: Int, val author: Writer) {

  def authorAge: Int = releaseYear - author.birthYear

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(releaseYear: Int) = new Novel(this.name, releaseYear, this.author)
}
