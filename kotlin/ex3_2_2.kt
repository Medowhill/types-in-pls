class Chooser<T>(val v1: T, val v2: T) {
    fun choose(): T = if (true) this.v1 else this.v2
}

fun main() {
    val c: Chooser<Int> = Chooser<Int>(1, 2)
    val n: Int = c.choose()
}
