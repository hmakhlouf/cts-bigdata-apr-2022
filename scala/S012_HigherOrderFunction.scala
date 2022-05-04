object S012_HigherOrderFunction extends  App {
  // higher order function
  // function that takes another function as parameter/input
  // sum of square/cube/sqrt of numbers

  val square = (n: Double) => n * n
  val cube = (n: Double) => n * n * n

  // define higher order function
  // Double => Doubule is function f , this function accept double as input, return double as output
  //     the function may be square, cube, sqrt tan, cos, ett.....
  // Double* - numbers, variable number of arguments
  // sum function returns double
  // s += f(n) , f may be square, cube, sqrt, etc anything
  val sum: ( (Double) => Double, Double*) => Double = (f, numbers ) => {
    var s: Double = 0.0
    for (n <- numbers) {
      s += f(n)
    }

    s
  }

  println( sum (square) )
  println( sum (square, 5.0) )

  println( sum (square, 10.0, 5.0) )

  // sub of log of numbers
  val sumOfLogofNumbers = sum ( n => Math.log(n), 5.0, 10.0, 15.0, 20.0)
  println("sumOfLogofNumbers", sumOfLogofNumbers)

}
