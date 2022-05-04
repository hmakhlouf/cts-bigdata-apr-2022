object S016_ClassInheritance extends  App {
   class Order(val id: Int, private val price: Double, protected  val tax: Double) {
     println("ORder called", price)
   }

  // i, p and t are constructor parameters, not member variables
  // member variabels must be declared either with val or var
  // if class parameter doesn't have var/val, it means, it is not member variables
  class TaxableOrder (i: Int, p: Double, t: Double) extends  Order(i, p, t) {
    println("Taxable order called")

    println("ID is ", id) // id is public scope
    //println("Price is ", price) // error price is private to order, not accessibel from taxable order
    println("Tax ", tax) // tax is protected scope, avail/accessible in driveed classes
  }

  val order = new TaxableOrder(1000, 500, 10)
}
