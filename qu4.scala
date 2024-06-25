object TheaterProfitCalculator {
  def attendees(price: Int): Int = {
    120 + ((15 - price) / 5 * 20)
  }

  def revenue(price: Int): Int = {
    attendees(price) * price
  }

  def cost(price: Int): Int = {
    500 + 3 * attendees(price)
  }

  def profit(price: Int): Int = {
    revenue(price) - cost(price)
  }

  def main(args: Array[String]): Unit = {
    println(s"Profit for ticket price 10: Rs.${profit(25)}")
    println(s"Profit for ticket price 15: Rs.${profit(30)}")
    println(s"Profit for ticket price 20: Rs.${profit(35)}")
  }
}
