object Lists extends App {
  val number =  List(1,2,3,4)
  println(number.mkString(","))

  val appended = number :+ 5
  println(appended.mkString(","))

  val prepended = 5 :: number
  println((prepended.reverse).mkString(","))


}