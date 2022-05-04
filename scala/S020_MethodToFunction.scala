object S020_MethodToFunction extends  App {
  // in scala, we have easy option to wrap a  method into a  function
  def add(a: Int, b: Int): Int = a + b

   println( add(10, 20) )
  // method is not a function, no apply method
  //add.apply(10, 20) // compiler error

  // using _, we can wrap a method into a funciton
  // sum is a function, Function2
  val sum  = (add _)
  println (sum(10, 20))
  println( sum.apply(10, 20) )



}
