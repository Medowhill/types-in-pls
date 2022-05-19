class Chooser:
  def choose[T](v1: T, v2: T): T = if true then v1 else v2

@main def main =
  val c: Chooser = Chooser()
  c.choose[Int](1, 2)
