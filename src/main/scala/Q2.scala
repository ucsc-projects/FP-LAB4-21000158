import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    print("Input an integer: ")
    val inputNumber = StdIn.readInt()
    patternMatcher(inputNumber)
  }

  def patternMatcher(num: Int): Unit = {
    num match {
      case x if x <= 0 => println("Negative/Zero")
      case x if x % 2 == 0 => println("Even")
      case _ => println("Odd")
    }
  }
}
