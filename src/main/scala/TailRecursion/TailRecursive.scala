package TailRecursion

import scala.annotation.tailrec


object TailRecursive:
  @tailrec
  def factorial(n: Long, res: Long = 1L): Long = {
    if (n == 0) {
      res
    } else {
      factorial(n - 1, res * n)
    }
  }
