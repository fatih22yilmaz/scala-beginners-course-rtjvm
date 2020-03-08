package lectures.part2oop

class Counter(val count: Int = 0) {

  def incrementCount() = {
    println("incrementing count by 1")
    new Counter(this.count + 1)
  } // immutability

  def decrementCount() = {
    println("decrementing count by 1")
    new Counter(this.count - 1)
  }

  def incrementCount(value: Int): Counter = {
    if (value <= 0) this
    else incrementCount.incrementCount(value - 1)
  }

  def decrementCount(value: Int): Counter = {
    if (value <= 0) this
    else decrementCount.decrementCount(value - 1)
  }

  def print() = println(count)
}
