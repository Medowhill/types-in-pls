trait Timestamper:
  type T
  def init: T
  def next(t: T): T
  def cmp(t1: T, t2: T): Boolean

class IntTimestamper extends Timestamper:
  type T = Int
  def init: T = 0
  def next(t: T): T = t + 1
  def cmp(t1: T, t2: T): Boolean = t1 < t2

class StringTimestamper extends Timestamper:
  type T = String
  def init: T = "a"
  def next(t: T): T = t + "a"
  def cmp(t1: T, t2: T): Boolean = t1.length < t2.length

def create(): Timestamper =
  if true then IntTimestamper() else StringTimestamper()

@main def main =
  val t: Timestamper = create()
  val ts0: t.T = t.init
  val ts1: t.T = t.next(ts0)
  t.cmp(ts0, ts1)
