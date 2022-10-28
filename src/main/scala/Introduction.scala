class Introduction {
  // function that sums the elements in an array of integers using a for loop
  def sum(array: Array[Int]): Int = {
    var sum = 0
    for (i <- array) {
      sum += i
    }
    sum
  }

  // function that sums the elements in an array of integers using recursion
  def sumRec(array: Array[Int]): Int = {
    if (array.length == 0) {
      0
    } else {
      array.head + sumRec(array.tail)
    }
  }

  // function to compute the nth Fibonacci number using recursion without using memoization (or other optimizations)
  def fib(n: Int): BigInt = {
    if (n == 0) {
      0
    } else if (n == 1) {
      1
    } else {
      fib(n - 1) + fib(n - 2)
    }
  }
}
