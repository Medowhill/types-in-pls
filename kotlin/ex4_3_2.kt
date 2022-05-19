open class Person(val age: Int)
class Student(age: Int) : Person(age)

class List<T> {
    fun length(): Int = 0
    fun get(idx: Int): T = TODO()
    fun add(t: T): Unit {}
}

fun averageAge(people: List<out Person>): Int {
    val len: Int = people.length()
    val age: Int = people.get(0).age
    return 0
}

fun addStudent(students: List<in Student>): Unit {
    if (students.length() < 0) {
        students.add(Student(0))
    }
}

fun main() {
    averageAge(List<Student>())
    addStudent(List<Person>())
}
