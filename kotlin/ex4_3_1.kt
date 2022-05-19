open class Person
class Student : Person()

class ReadOnlyList<out T> {
    fun get(idx: Int): T = TODO()
}

class Map<in T, S> {
    fun get(t: T): S = TODO()
    fun add(t: T, s: S): Unit {}
}

fun main() {
    val l: ReadOnlyList<Person> = ReadOnlyList<Student>()
    val m: Map<Student, Int> = Map<Person, Int>()
}
