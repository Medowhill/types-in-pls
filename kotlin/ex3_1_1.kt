fun <T> choose(v1: T, v2: T): T = if (true) v1 else v2

fun main() {
    val str: String = choose<String>("Korean", "Foreigner")
    val num: Int = choose<Int>(1, 2)
}
