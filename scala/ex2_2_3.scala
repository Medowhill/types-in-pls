def write(data: String | Int): Unit =
  data match
    case str: String =>
    case num: Int =>

@main def main =
  write("a")
  write(1)
