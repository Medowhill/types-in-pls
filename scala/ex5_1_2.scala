class Cell:
  def write(str: String): Unit = ()
  def write(num: Int): Unit = ()

@main def main =
  val c: Cell = Cell()
  c.write("Hello")
  c.write(42)
