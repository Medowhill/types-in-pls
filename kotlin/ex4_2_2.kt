abstract class Comparable<T> {
    abstract fun gt(that: T): Boolean
}

fun <T : Comparable<T>> sort(lst: List<T>): Unit {
    if (lst[0].gt(lst[1])) {}
}

class Person(val age: Int) : Comparable<Person>() {
    override fun gt(that: Person): Boolean = this.age > that.age
}

fun main() {
    val people: List<Person> = listOf()
    sort<Person>(people)
}
