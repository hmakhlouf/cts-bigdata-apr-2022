import java.lang.reflect.MalformedParametersException

object S023_TryCatch extends  App {
  try {
    42 / 2
    println("i will print")
  } catch {
    case e:ArithmeticException => println ("divide by zero error ", e)
    case _ => println( "Unknown error")
  } finally {
     println("Finally block")
  }

  println ("I will print")

  // try catch is an expression, that returns result
  val result = try {
                    // 42 / 2 // scenario 1
                   // 42 / 0  //scenario 2, where ArithmaticException thrrown
                    // throw exception // scenario 3
                    throw new MalformedParametersException()
                  }
                catch  {
                  case e: ArithmeticException => 0
                  case _ => -1
                }

  println("Result is ", result)
}
