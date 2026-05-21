/*object Addition extends App {

  val x = 10
  val y = 20

  def sum(a: Int, b: Int): Int = a + b

  val res = sum(x,y)

  println(res)
}*/

//firstly prefer val for variables unless mutability is needed
//secondly when we use def sum(a: Int, b: Int): Int = a + b, we are actually adding a return type Int for the sum method
//else it would have been  def sum(a: Int, b: Int): Unit = {...}
//so now sum(x,y) will have the value returned to variable "res"


object Convert extends App {
    val fah: Int = 32
    def toCelsius (fahrenheit: Int): Int = (fahrenheit - 32) * 5/9

    val res = toCelsius(fah)

    println(res)

}