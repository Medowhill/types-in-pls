class Vector2:
  def add(v: SparseVector): Vector2 = Vector2()

class SparseVector extends Vector2:
  override def add(v: SparseVector): SparseVector = SparseVector()
