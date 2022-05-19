abstract class EmailDst {
    abstract fun sendEmail(content: String): Unit
}

class Person : EmailDst() {
    override fun sendEmail(content: String): Unit {}
}

fun sendNewYearEmail(dst: EmailDst): Unit {
    dst.sendEmail("")
}

fun main() {
    val pr: Person = Person()
    sendNewYearEmail(pr)
}
