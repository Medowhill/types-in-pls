fun error(): Nothing = throw Exception()

fun assertNonzero(num: Int): Int =
    if (num != 0) num else error()

fun assertShort(str: String): String =
    if (str.length <= 10) str else error()
