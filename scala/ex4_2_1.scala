import reflect.Selectable.reflectiveSelectable

class Person(val age: Int)
class Student(age: Int) extends Person(age)

def elder[T <: Person](p: T, q: T): T =
  if p.age >= q.age then p else q

@main def main =
  val p: Person = elder[Person](Person(0), Person(1))
  val s: Student = elder[Student](Student(0), Student(1))

class Group[T <: Person](p: T):
  def sortByAge(): Unit =
    val age: Int = p.age

def elder2[T <: { val age: Int }](p: T, q: T): T =
  if p.age >= q.age then p else q

def foo[T >: Person](t: T): Unit = ()
def bar[T >: Student <: Person](t: T): Unit = ()
