open class Person
class Student : Person()

fun startMentoring(select: (Student) -> Person): Unit {
    val st: Student = Student()
    val mentor: Person = select(st)
}

fun selectStudentMentor(st: Student): Student = Student()

fun sendEmails(needEmail: (Student) -> Boolean): Unit {
    val st: Student = Student()
    if (needEmail(st)) {}
}

fun isHacked(pr: Person): Boolean = true

fun main() {
    startMentoring(::selectStudentMentor)
    sendEmails(::isHacked)
}
