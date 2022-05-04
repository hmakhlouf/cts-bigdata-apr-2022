object S021_CaseClasses extends App {
  // case class are known as domain object
  // represent a record such as customer, bank, account, balance etc
  // scala being smart lang, it will convert internally case class into companion object

  // symbol, price and timestamp are member variabels of Tick class
  // symbol, pricee and timestamp are value type
  // promote immutablity
  case class Tick(symbol: String, price: Double, timestamp: Long)

  val tick1 = Tick("TSLA", 300, System.currentTimeMillis())
  val tick2 = Tick("FB", 200, System.currentTimeMillis())

  println(tick1)
  println(tick2)
  println((tick1.symbol, tick1.price, tick1.timestamp))



}
