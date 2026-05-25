import scala.io.StdIn.readLine

case class Account private (balance: Double)

object Account {
  def create(amount: Double): Option[Account] = {
    if (amount >= 0) Some(Account(amount)) else None
  }
}

object BankApp extends App {
  println("Enter amount = ")
  val amount = readLine()

  amount.toDoubleOption match {

    // String successfully converted to Double
    case Some(amount) =>

      Account.create(amount) match {

        // Valid balance
        case Some(acc) =>
          println(s"Account created with balance ${acc.balance}")

        // Negative balance
        case None =>
          println("Invalid balance! Amount cannot be negative.")
      }

    // Invalid string input
    case None =>
      println("Invalid input! Please enter a numeric value.")
  }

}

//simple banking app which handles user inputs as in user enters amount and based on the type of value it stores/discards the amount.
//demonstrated the use of companion objects here and used nested pattern matching to handle edge cases
