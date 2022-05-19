def simulate(rand: [T] => List[T] => T): Unit =
  val number: Int = rand[Int](List[Int](1, 2))
  val species: String = rand[String](List[String]("a", "b"))

def randUniform[T](lst: List[T]): T = ???
def randGeometric[T](lst: List[T]): T = ???

@main def main =
  simulate([T] => (lst: List[T]) => randUniform(lst))
  simulate([T] => (lst: List[T]) => randGeometric(lst))
