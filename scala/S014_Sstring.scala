object S014_Sstring extends  App {

  // String Template known as s string
  val name = "Scala"
  val version = "2.12"
  val course = "Learn " + name + " " + version
  val course2 = s"Learn $name $version" // s string, where $name and $version represent variable

  println(course)
  println(course2)
}
