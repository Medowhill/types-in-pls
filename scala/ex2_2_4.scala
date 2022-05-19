trait Student(val grade: Float)
trait Teacher(val course: String)

class TA(
    gpa: Float, course: String
) extends Student(gpa) with Teacher(course)

class Volunteer(
    gpa: Float, course: String
) extends Student(gpa) with Teacher(course)

def getGrade(st: Student & Teacher): Float =
  val grade: Float = st.grade
  val course: String = st.course
  0.0

@main def main =
  getGrade(TA(0.0, ""))
  getGrade(Volunteer(0.0, ""))
