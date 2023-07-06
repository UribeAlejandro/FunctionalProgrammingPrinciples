package TailRecursion

import org.scalatest.funsuite.AnyFunSuite

class TailRecursiveTest extends AnyFunSuite {
    test("TailRecursion.TailRecursive.factorial") {
        assert(TailRecursion.TailRecursive.factorial(0) == 1)
        assert(TailRecursion.TailRecursive.factorial(1) == 1)
        assert(TailRecursion.TailRecursive.factorial(5) == 120)
        assert(TailRecursion.TailRecursive.factorial(10) == 3628800)
    }
}
