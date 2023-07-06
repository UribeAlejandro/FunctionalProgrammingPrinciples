package PatternMatching

import org.scalatest.BeforeAndAfterEach
import org.scalatest.funsuite.AnyFunSuiteLike

class PatternMatcherTest extends AnyFunSuiteLike with BeforeAndAfterEach {

  test("testMatchPerson") {
    val p: Person = Person("John", 30)
    val p1: Person = Person("John", 17)
    assert(PatternMatching.PatternMatcher.matchPerson(p) == "Adult")
    assert(PatternMatching.PatternMatcher.matchPerson(p1) == "Kid")
  }

  test("testMatchSeq") {
    val n: Seq[Int] = Nil
    val m: Seq[Int] = null
    val s: Seq[Int] = Seq()
    val s1: Seq[Int] = Seq(1)
    val s2: Seq[Int] = Seq(1,2)
    val s3: Seq[Int] = Seq(1, 2, 3)
    val s4: Seq[Int] = Seq(1, 2, 3, 4)
    val s5: Seq[Int] = Seq(1, 2, 3, 4, 5)

    assert(PatternMatching.PatternMatcher.matchSeq(n) == 0)
    assert(PatternMatching.PatternMatcher.matchSeq(s) == 0)
    assert(PatternMatching.PatternMatcher.matchSeq(s1) == 1)
    assert(PatternMatching.PatternMatcher.matchSeq(s2) == 3)
    assert(PatternMatching.PatternMatcher.matchSeq(s3) == 6)
    assert(PatternMatching.PatternMatcher.matchSeq(s4) == 10)
    assert(PatternMatching.PatternMatcher.matchSeq(s5) == -1)
    assert(PatternMatching.PatternMatcher.matchSeq(m) == -1)
  }

  test("testMatchTuple") {
    assert(PatternMatching.PatternMatcher.matchTuple((1, 1)) == "one, one")
    assert(PatternMatching.PatternMatcher.matchTuple((1, 0)) == "one, other")
    assert(PatternMatching.PatternMatcher.matchTuple((-1, 1)) == "other, one")
    assert(PatternMatching.PatternMatcher.matchTuple((-1, -1)) == "other, other")
  }

  test("testMatchInt") {
    assert(PatternMatching.PatternMatcher.matchInt(1) == "one")
    assert(PatternMatching.PatternMatcher.matchInt(2) == "two")
    assert(PatternMatching.PatternMatcher.matchInt(3) == "other")
  }

  test("testMatchString") {
    assert(PatternMatching.PatternMatcher.matchString("one") == "1")
    assert(PatternMatching.PatternMatcher.matchString("two") == "2")
    assert(PatternMatching.PatternMatcher.matchString("") == "other")
    assert(PatternMatching.PatternMatcher.matchString("other") == "other")
  }

}

