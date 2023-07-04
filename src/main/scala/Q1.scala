import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter deposit amount: ")
    val amount: Double = StdIn.readDouble()
    if (amount <= 0) {
      System.err.println("Invalid amount!")
      System.exit(1)
    }
    var interest: Double = calculateInterest(amount)
    println("Your interest for deposited " + amount + " is : " + interest)

  }

  def calculateInterest(depositAmount: Double): Double = {
    depositAmount match {
      case x if x <= 20000 => x * 0.02
      case x if x <= 200000 => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case x if x > 2000000 => x * 0.065
    }
  }
}
