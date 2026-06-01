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

  //To create a list use the infix (::) operator

  val fruits = "Apple" :: ("Orange" :: ("Banana":: Nil))
  println(fruits)

  val diag = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil

  println(diag.mkString(" "))


  //Higher Order Functions on List

  //map -> transform each element in a list using a given function
  val n = List(1,2,3)
  val p = n.map(_ * 2)
  val s = n.map(_ + 1)
  println(s)
  println(p)

  //filter -> selects elements that satisfy a given condition
  val numeric = List(1,2,3,4,5,6,7,8)
  val even = numeric.filter(_ % 2 == 0)
  println(even)

  //partition -> splits a list into two based on a given condition
  val separate = numeric.partition(_ % 2 == 0)
  println(separate)

  //foreach -> applies a procedure to each element without creating a new list. It returns nothing(Unit).
  var prod = 1
  val x = numeric.foreach(prod *= _)
  //println(x)
  println(prod)

  //sort -> arranges the list in ascending or descending order
  val sample = List(7,4,9,10,2,5,1,8,3,6)
  val sortedList  = sample.sorted
  println(sortedList)

  val sortedList2 = sample.sortWith((a,b) => a > b)
  println(sortedList2)

  val(evens, odds) = sample.partition(_ % 2 == 0)
  val finalList = evens.sorted ++ odds.sorted

  println(finalList)
}