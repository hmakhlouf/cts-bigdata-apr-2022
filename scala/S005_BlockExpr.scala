object S005_BlockExpr extends  App {
  // Scala is more expression oriented language rather than statement oriented
  // statement: The system execute it , it doesn't return value
  // expression: teh system executed, it does return value

  // In other languages like java, we cannot assign output of if condition to a variable/value
  // in java, if is a statement, not expression, statement never return value

  val a = 10 + 20
  val b = 50
  // in scala, the curly brace or block statement is also an expression

  val c = { 10 + 20 }

  val d = {
    println("inside block")
    40 // the last evaluated value in teh block is returned as result
  }

  val e = {a + b}
  // a, b, c, d, e are int type
  println("a", a)
  println("b", b)
  println("c", c)
  println("d", d)

  println("e", e)

}
