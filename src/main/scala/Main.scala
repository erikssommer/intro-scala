object Main {
  def main(args: Array[String]): Unit = {

    // Hello World in Scala
    println("Hello world!")

    // Task 1: Scala Introduction
    val introduction = new Introduction()
    // a) Generate an array containing the values 1 up to and including 50 using for loop
    val array = for (i <- 1 to 50) yield i
    println(array.mkString(", "))

    // b) Create a function that sums the elements in an array of integers using a for loop

    // Testing with array from a)
    println("Sum using for loop: " + introduction.sum(array.toArray))

    // c) Create a function that sums the elements in an array of integers using recursion

    // Testing with array from a)
    println("Sum using recursion: " + introduction.sumRec(array.toArray))

    // Create a function to compute the nth Fibonacci number using recursion without using memoization (or other optimizations).
    // Use BigInt instead of Int.
    // What is the difference between these two data types?

    // The difference between Int and BigInt is that Int is a 32-bit signed integer,
    // while BigInt is an arbitrary-precision integer.
    // Testing with n = 9
    println("Fibonacci number of 9: " + introduction.fib(9))

    // Task2: Concurrency in Scala

    // a) Create a function that takes as argument a function and returns a Thread initialized with the input function.
    // Make sure that the returned thread is not started.
    def thread(f: => Unit): Thread = {
      val t = new Thread {
        override def run(): Unit = f
      }
      t
    }

    // b) Given the following code snippet:
    private var counter: Int = 0
    def increaseCounter(): Unit = {
      counter += 1
    }

    // Create a function that prints the current counter variable.
    def printCounter(): Unit = {
      println(counter)
    }
    // Start three threads, two that initialize increaseCounter





  }
}