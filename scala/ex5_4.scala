class ArrayList[T]
class LinkedList[T]

trait ListLike[L[_]]:
  def length[T](lst: L[T]): Int
  def add[T](lst: L[T], elem: T): Unit

given ListLike[ArrayList] with
  def length[T](lst: ArrayList[T]): Int = 0
  def add[T](lst: ArrayList[T], elem: T): Unit = ()

given ListLike[LinkedList] with
  def length[T](lst: LinkedList[T]): Int = 0
  def add[T](lst: LinkedList[T], elem: T): Unit = ()

def addUntil[L[_]: ListLike, T](lst: L[T], v: T, len: Int) =
  while summon.length[T](lst) < len do
    summon.add[T](lst, v)
