class Person
class Student extends Person

def startMentoring(select: Student => Person): Unit =
  val st: Student = Student()
  val mentor: Person = select(st)

def selectStudentMentor(st: Student): Student = Student()

def sendEmails(needEmail: Student => Boolean): Unit =
  val st: Student = Student()
  if needEmail(st) then ()

def isHacked(pr: Person): Boolean = true

@main def main =
  startMentoring(selectStudentMentor)
  sendEmails(isHacked)
