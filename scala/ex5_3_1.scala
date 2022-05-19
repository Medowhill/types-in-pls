trait Comparable[T]:
  def gt(v1: T, v2: T): Boolean

given Comparable[Int] with
  def gt(v1: Int, v2: Int): Boolean = v1 > v2

given Comparable[String] with
  def gt(v1: String, v2: String): Boolean = v1 > v2

def sort[T: Comparable](lst: List[T]): Unit =
  if summon.gt(lst(0), lst(1)) then ()

given [T]: Comparable[List[T]] with
  def gt(v1: List[T], v2: List[T]): Boolean = v1.length > v2.length

@main def main =
  summon[Comparable[Int]].gt(1, 2)
  summon[Comparable[String]].gt("a", "b")
  sort[Int](List(2, 3, 1))
  sort[String](List("b", "c", "a"))
  sort[List[Int]](List(List(1, 2), List(1, 2, 3), List(1)))
