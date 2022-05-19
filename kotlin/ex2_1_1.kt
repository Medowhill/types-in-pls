open class Person(val email: String)
class Student(email: String, val grade: Int) : Person(email)

fun sendEmail(person: Person): Unit {
    val email: String = person.email
}

fun main() {
    val st: Student = Student("", 0)
    sendEmail(st)
}
