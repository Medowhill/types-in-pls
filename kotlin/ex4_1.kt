abstract class List<T> {
    abstract fun get(idx: Int): T
}

class ArrayList<T> : List<T>() {
    override fun get(idx: Int): T = TODO()
}

class BitVector : List<Boolean>() {
    override fun get(idx: Int): Boolean = true
}

fun main() {
    val l1: List<String> = ArrayList<String>()
    val l2: List<Boolean> = ArrayList<Boolean>()
    val l3: List<Boolean> = BitVector()
}
