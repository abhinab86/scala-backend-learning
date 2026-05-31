object Lists extends App {
  val number =  List(1,2,3,4,5,6,7,8)
  println(number.mkString(","))

  val appended = number :+ 5
  println(appended.mkString(","))  // adds 5 to the end of the list

  val prepended = 5 :: number
  println((prepended).mkString(","))  // adds 5 to the start of the list

  println(number.head)      // prints the first element
  println(number.tail.mkString(","))   // prints the remaining elements excluding the first

  println(number.slice(1,4).mkString(","))  //extracts elements between starting index(inclusive) and ending index(exclusive)

  println(number.drop(4).mkString(","))  //discards the first n elements

  println(number.take(4).mkString(","))  // takes in the first n elements

  val num = List(1,2,3,6,2,7,3,8,5,4,2,1)
  println(num.distinct.mkString(","))  // removes duplicate elements from the list

}