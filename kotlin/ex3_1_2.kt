class Chooser {
    fun <T> choose(v1: T, v2: T): T = if (true) v1 else v2
}

fun main() {
    val c: Chooser = Chooser()
    c.choose<Int>(1, 2)
}
