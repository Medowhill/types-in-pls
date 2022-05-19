def error(): Nothing = throw Exception()

def assertNonzero(num: Int): Int =
  if num != 0 then num else error()

def assertShort(str: String): String =
  if str.length <= 10 then str else error()
