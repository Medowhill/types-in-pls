abstract class Comparable[T]:
  def gt(that: T): Boolean

def sort[T <: Comparable[T]](lst: List[T]): Unit =
  if lst(0).gt(lst(1)) then ()

class Person(val age: Int) extends Comparable[Person]:
  def gt(that: Person): Boolean = this.age > that.age

@main def main =
  val people: List[Person] = List()
  sort[Person](people)
