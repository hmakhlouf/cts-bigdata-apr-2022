object S013_Classes extends  App {
// classes are prototype of objects

  // member variables can be declared in class defnintion
  // or within class
  // by default all member vartiabels are public scope
  class Product (val id: Int, val name:String, val price: Double) {
    var grandTotal: Double = 0
    // class body, itself is a default constructor, any code here executed first
    println("PRoduct Created")

    def applyDiscount(p: Double) = {
      grandTotal = price - (price * p)/100.0
    }

    // similar to python's __str__ which was called during print/string representation
    // in scala/java/c#, we have toString(), called autoamtically when we print objects
    override def toString():String = s"Product($id, $name, $price, $grandTotal)"
  }

  val p1 = new Product(1001, "iPhone 12", 1000.0)
  val p2 = new Product(1002, "Galaxy", 750.0)
  p1.applyDiscount(10)
  p2.applyDiscount(20)
  println(p1.id, p1.name, p1.price, p1.grandTotal)
  println(p2.id, p2.name, p2.price, p2.grandTotal)

  println(p1) // calls toString() and print output of toString
  println(p2) // calls toString()


}
