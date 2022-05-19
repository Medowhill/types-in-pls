open class Vector {
    open fun length(): Int = 0
}
class SparseVector : Vector() {
    override fun length(): Int = 1
}

fun main() {
    val v: Vector = SparseVector()
    v.length()
}
