object S006_If extends  App {
   // in scala, if is an expression, means that if expression can return value

  // the result is a boolean
  // 10 % 2 == 0, the condition return true
  val result = if (10 % 2 == 0) true else false
  println(result) // true

  val result2 = if (11 % 2 == 0) true else false
  println(result2) // false

  val result3 = if (10 % 2 == 0) {
                            // block statement
                           println("Even number")
                           true // this is last expression, this value returned and assgiend to result3
                        }        else {
                            println("odd number")
                            false // this value returend if odd number
                        }

  println(result3)

  val gr = {
    val a = 60
    val b = 70
    val c = 80

    // output of if statement is value a ie 60, that will be returned
    val result = if (a > b && a > c) {
      a // last value returned
    } else if (b > c) b // last value returned
    else {
      c // last value returned
    }

    result // last value that could be returned
  }

  println(gr)


  // In scala, we have void type, it means Unit data type
  // Unit means no value, represent void

  //Give me box full of balls
  // Someone return empty box
  // some one return box full of balls


  val gr2 = {
    val a = 60
    val b = 40
    val c = 50

    // what is value of result? Unit
    val result = if (a > b && a > c) {
      // println is the last executed statement, that returns unit, this unit returend to result
      println("A is greater") // return Unit
    } else if (b > c) println("B is greater")
    else {
      println("C is greater")
    }

    result // Unit
  }

  println(gr2) // what will be printing (), () means Unit
}
