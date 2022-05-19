class Person(val email: String)
class Student(email: String, val grade: Int) extends Person(email)

def sendEmail(person: Person): Unit =
  val email: String = person.email

@main def main =
  val st: Student = Student("", 0)
  sendEmail(st)
