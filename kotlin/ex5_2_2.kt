open class Vector {
    open fun add(v: SparseVector): Vector = Vector()
}
class SparseVector : Vector() {
    override fun add(v: SparseVector): SparseVector = SparseVector()
}
