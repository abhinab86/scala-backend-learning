
object Variables extends App {
  val name = "Abhinab"
  println(name)

 // val name  = "Aloha"
 // println(name)          // will throw error as val is immutable

  var nam = "Rahul"
  println(nam)

  nam = "Raj"
  print(nam)     // will not throw error and print "Raj" as var is mutable and hence the variable
                 // once assigned a value can be re-assigned with another value


}