abstract class List[T]:
  def get(idx: Int): T

class ArrayList[T] extends List[T]:
  def get(idx: Int): T = ???

class BitVector extends List[Boolean]:
  def get(idx: Int): Boolean = true

@main def main =
  val l1: List[String] = ArrayList[String]()
  val l2: List[Boolean] = ArrayList[Boolean]()
  val l3: List[Boolean] = BitVector()
