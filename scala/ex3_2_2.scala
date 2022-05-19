class Chooser[T](v1: T, v2: T):
  def choose(): T = if true then v1 else v2

@main def main =
  val c: Chooser[Int] = Chooser[Int](1, 2)
  val n: Int = c.choose()
