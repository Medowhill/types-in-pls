class Cell {
    fun write(str: String): Unit {}
    fun write(num: Int): Unit {}
}

fun main() {
    val c: Cell = Cell()
    c.write("Hello")
    c.write(42)
}
