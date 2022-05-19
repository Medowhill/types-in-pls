import reflect.Selectable.reflectiveSelectable

class Person(val email: String)
class Student(val email: String, val grade: Int)

def sendEmail(person: { val email: String }): Unit =
  val email: String = person.email

@main def main =
  val st: Student = Student("", 0)
  sendEmail(st)
