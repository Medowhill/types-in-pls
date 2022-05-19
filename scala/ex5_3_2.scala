trait Comparable[T]:
  def gt(v1: T, v2: T): Boolean

given Comparable[Int] with
  def gt(v1: Int, v2: Int): Boolean = v1 > v2

def sort[T: Comparable](lst: List[T]): Unit =
  if summon.gt(lst(0), lst(1)) then ()

given [T: Comparable]: Comparable[List[T]] with
  def gt(v1: List[T], v2: List[T]): Boolean =
    if summon.gt(v1(0), v2(0)) then ()
    true

@main def main =
  sort[List[Int]](List())
  sort[List[List[Int]]](List())
