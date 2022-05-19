open class Person(val age: Int)
class Student(age: Int) : Person(age)

fun <T : Person> elder(p: T, q: T): T =
    if (p.age >= q.age) p else q

fun main() {
    val p: Person = elder<Person>(Person(0), Person(1))
    val s: Student = elder<Student>(Student(0), Student(1))
}

class Group<T : Person>(val p: T) {
    fun sortByAge(): Unit {
        val age: Int = this.p.age
    }
}
