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
    val concurrency = new Concurrency()

    // Start three threads, two that initialize increaseCounter and one that initialize the print function.
    concurrency.thread(concurrency.increaseCounter()).start()
    concurrency.thread(concurrency.increaseCounter()).start()
    concurrency.thread(concurrency.printCounter()).start()

    // Run your program a few times and notice the print output. What is this phenomenon called?
    // Give one example of a situation where it can be problematic.

    // This is called deadlock and it occurs when two threads that depends on eachother try to access the same variable
    // One of them can therefor be blocked from making a change to the variable.
    // A situation where this can be problematic is when two threads are trying to access the same variable in a database.



  }
}