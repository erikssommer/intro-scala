object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    // a) Generate an array containing the values 1 up to and including 50 using for loop
    val array = for (i <- 1 to 50) yield i
    println(array.mkString(", "))
  }
}