class Person
class Student extends Person

class ReadOnlyList[+T]:
  def get(idx: Int): T = ???

class Map2[-T, S]:
  def get(t: T): S = ???
  def add(t: T, s: S): Unit = ()

@main def main =
  val l: ReadOnlyList[Person] = ReadOnlyList[Student]()
  val m: Map2[Student, Int] = Map2[Person, Int]()
