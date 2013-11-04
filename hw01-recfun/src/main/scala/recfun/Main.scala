package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (r == 0 || c == 0 || r == c) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def check(char_list: List[Char], parens: Int): Boolean =
      char_list match {
        case Nil => parens == 0
        case '(' :: cs => check(cs, parens + 1)
        case ')' :: cs => if (parens > 0) check(cs, parens - 1) else false
        case c :: cs => check(cs, parens)
      }
    check(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) 0
    else coins match {
      case Nil => if (money != 0) 0 else 1
      case c :: cs => countChange(money - c, coins) + countChange(money, cs)
    }
  }
}
