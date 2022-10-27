object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    // a) Generate an array containing the values 1 up to and including 50 using for loop
    val array = for (i <- 1 to 50) yield i
    println(array.mkString(", "))

    // b) Create a function that sums the elements in an array of integers using a for loop
    def sum(array: Array[Int]): Int = {
      var sum = 0
      for (i <- array) {
        sum += i
      }
      sum
    }

    // Testing with array from a)
    println(sum(array.toArray))
  }
}