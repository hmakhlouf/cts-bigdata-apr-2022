object S015_ClassAccessSpecificer extends App {
  // public - default, scala has no keyword public
  // private - keyword, only within class
  // protected - keyword, with in class and derived class

  // id is public scope
  // amount is private scope, accessible only with in Order class
  // tax is protected scope, accessible only with in Order class and derived class
  class Order(val id: Int, private val amount: Double, protected var tax: Double) {
    println("ORder created ")
    println("ID ", id)
    println("Amount ", amount)
    println("Tax ", tax)
  }

  val order1 = new Order(100, 350, 10)
  println("Order 1 id", order1.id) // works
//  println("Order 1 amount", order1.amount) // error since amount is private to class
 // println("Order 1 tax", order1.tax) // error since tax is protected with in class and derived classe
}
