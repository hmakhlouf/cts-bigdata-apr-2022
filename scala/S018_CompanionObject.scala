object S018_CompanionObject extends App {
  // in the same file, if we have class and object share same name, then
  // class/object are known as as companion object
  // use case for companion object is not/limit to use new keyword to create object
  class Brand(val id: Int, val name: String) {
    println("Brand created ", id, name)
  }

  object Brand {
    // special functions, called apply
    // apply function or companion object used as factory to produce brand object
    // new keyword is limited with in companion object
    def apply(id: Int, name: String) = new Brand(id, name)
  }

  // how we create object in scala, we use new keyword
  // Scala lang, sees that new keyword is not functional
  // note: We dont use new keyword to create object here
  val b1: Brand = Brand(1, "Apple") // this automatically calls Brand.apply that create object for brand
 // val b2: Brand = Brand.apply(2, "Samsung")
}
