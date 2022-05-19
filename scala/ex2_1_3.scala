import reflect.Selectable.reflectiveSelectable

abstract class EmailDst:
  def sendEmail(content: String): Unit

class Person extends EmailDst:
  def sendEmail(content: String): Unit = ()

def sendNewYearEmail(dst: EmailDst): Unit =
  dst.sendEmail("")

def sendNewYearEmail2(dst: { def sendEmail(content: String): Unit }): Unit =
  dst.sendEmail("")

@main def main =
  val pr: Person = Person()
  sendNewYearEmail(pr)
  sendNewYearEmail2(pr)
