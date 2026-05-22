/*case class User(name: String, email: String)

// You can extend the companion object manually!
object User extends App {
  def fromDatabaseString(s: String): User = {
    val parts = s.split(",")
    User(parts(0), parts(1))
  }
  val user = User.fromDatabaseString("Alice,alice@example.com")
  print(user)
}
 */

sealed trait Shape

case class Circle(radius: Double) extends Shape
case class Rectangle(length: Double, breadth: Double) extends Shape
case class Triangle(base: Double, height: Double) extends Shape

object ShapeCalculator extends App {
  def area(shape: Shape): Double = shape match {
    case Circle(r) => 3.14 * r * r
    case Rectangle(l, b) => l * b
    case Triangle(b, h) => 0.5 * b * h
  }


  val myCircle = Circle(5)
  val myRect = Rectangle(3, 5)
  val myTriangle = Triangle(4, 6)


  println(s"Area of circle = ${ShapeCalculator.area(myCircle)}")
  println(s"Area of rectangle = ${ShapeCalculator.area(myRect)}")
  println(s"Area of rectangle = ${ShapeCalculator.area(myTriangle)}")
}