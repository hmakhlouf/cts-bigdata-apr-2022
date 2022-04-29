object S010_Functions extends  App {
  // Functions are known as first class citizen
  // Means that functions are basically objects
  // objects can be assigned, copied, passed as argument, returend as argument from another function
  // Functions are known as lambda in python, c#, java languages
  // in scala, we use => to define functions
  // Scala methods are not functions
  // greeting is a function, it does not take any parameter, does not return any result
  // return unit
  // greeting is function, type is derived by type inference
  val greeting = () => println("Good morning")

   greeting()
  greeting()

  // create a function called greet, accept a parameter, doens't return result [unit]
  val greet = (name: String) => println("Good Morning", name)

  greet("Jane")
  greet("Nila")

  val r: Unit = println("Hello World") // println return unit
  println ("R ", r) // r is a  unit

  // power, accept 1 parameter as Int, return 1 result as int
  // scala assumes that return value is int, as we return n * n
  val power = (n: Int) => n * n

  val k = power (5) // k is int
  println("k ", k)

  // power is a reference to a function, power is an object
  val p = power

  val j = p (5) // calls the  function

  println("j ", 25)

  val add = (a: Int, b: Int) => {
    println("Inside add function ", a, b)
    a + b // return a + b as this is last evaluated
  }

  val sum = add

  println (add(10, 20))
  println (sum (5, 10))


}
