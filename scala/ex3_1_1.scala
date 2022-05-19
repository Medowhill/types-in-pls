def choose[T](v1: T, v2: T): T = if true then v1 else v2

@main def main =
  val str: String = choose[String]("Korean", "Foreigner")
  val num: Int = choose[Int](1, 2)
