object S004_TypeInference extends  App {
  // Type Inference : Teh compiler automatically declare type based on right side expression
  // now scala type inference, by scala compiler evaluate what is "scala"
  // "scala" is string, so it declare name as String type
  var name = "Scala"
  println(name)
  name = "Scala 2.13"
  println(name)

  // we cannot assign other data types
  // fail at compilation: Type Mismatch error, assing int to str data type
  // name = 10

  var n = 10
  println(n)

  n = 12
  println(n)

}
