class Vector:
  def length(): Int = 0

class SparseVector extends Vector:
  override def length(): Int = 1

@main def main =
  val v: Vector = SparseVector()
  v.length()
