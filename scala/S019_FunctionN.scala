object S019_FunctionN extends  App {

  // lambda => , is a syntatic sugar
  // functions are basically instances of FunctionN classes
  // FunctionN, where N is 0, 1 ...22
  // Function0, a function that doesn't take any argument, may return value otherwise unit value
  // Function1 , a function that takes 1 argument, may return value or unit
  // Function2, a fucntio nthat takes 2 arguments.........

  // FunctionN, the right most one, is return type
  val greeting: Function0[Unit] = () => println("Hello World")
  val greet:Function1[String, Unit] = (name: String) => println("Hello ", name)

  greeting()
  greeting.apply()
  greet("Nila")
  greet.apply("Nila")

  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
      def apply(a: Int, b: Int) : Int = a + b
  }

  println( add(10, 20)) // implicitly calls add.apply
  println(  add.apply(10, 20))

}
