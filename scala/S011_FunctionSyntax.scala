object S011_FunctionSyntax extends  App {
  // how to declare a function ourself using type
  // Functions are annnoymous, no name given to them
  // name is value, String is a type, "Nila" object we assigned to name
  // : left side of colon is identifier [name]
  // right side of colon is data type String
  // after = , we have expression Nila
  val name: String = "Nila"

  // greeting function doesn't accept any parameter, return Unit
  // greeting is a variable/ref to function
  // after colon , data type
  //  () => Unit  is a data type of a function , a function that accept no parameter, return Unit
  // after = , we have function definition
  val greeting: () => Unit  = () => println("Good morning")

  greeting()

  // greet is variable ref to function
  // (String) => Unit is a data type of function, a function that accept 1 string paramter, return unit
  // (name) => println("Good morning ", name) is function definition
  val greet: (String) =>  Unit = (name) => println("Good morning ", name)

  greet("Nila")
  // a function that doesn't accpet parameter, return double
  val getPI: () => Double = () => 3.14

  println(getPI())

  // a function that accept int as input, reutrn int as result
  val power: (Int) => Int = n => n * n

  println(power(5))

  val add: (Int, Int) => Int = (a, b) => a + b

  println(add(10, 20))

  val r2 = add.apply(100, 200)
  println("R2", r2)

}
