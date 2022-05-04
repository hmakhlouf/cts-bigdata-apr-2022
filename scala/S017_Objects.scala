object S017_Objects extends App {
  // objects in scala represent singleton nature of java static classes
  // Java has static members and static methods which can be accessible via class

  // in scala, we have no static classes
  // object , itself is an instance, we cannot create further instance

  //useful to represent static featuer in java
  // objects are singleton, at any money , only on object present
  object Logger {
    // object constructor, this body block executed at first use of object
    println("Inside Logger")
    // can have member variables
    // can have member functions

    var logLevel: Int = 0 // member variable
    def error(msg: String) = println("Error " + msg) // member function
  }

  // Logger first time
  //Logger

  Logger.logLevel = 2 // access logger member variable
  Logger.error("Somethign wrong with db")

}
