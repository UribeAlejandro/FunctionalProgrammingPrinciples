package PatternMatching

object PatternMatcher:
  def matchInt(i: Int): String = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }

  def matchString(s: String): String = s match {
    case "one" => "1"
    case "two" => "2"
    case _ => "other"
  }

  def matchTuple(t: (Int, Int)): String = t match {
    case (1, 1) => "one, one"
    case (1, _) => "one, other"
    case (_, 1) => "other, one"
    case _ => "other, other"
  }

  def matchSeq(l: Seq[Int]): Int = l match {
    case Nil => 0
    case List(a:Int) => a
    case List(a:Int, b:Int) => a + b
    case List(a:Int, b:Int, c:Int) => a + b + c
    case List(a:Int, b:Int, c:Int, d:Int) => a + b + c + d
    case _ => -1
  }

  def matchPerson(p: Person): String = p match {
    case y if y.age >= 18 => "Adult"
    case _ => "Kid"
  }
