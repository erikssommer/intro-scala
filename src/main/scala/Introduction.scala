class Introduction {
  def sum(array: Array[Int]): Int = {
    var sum = 0
    for (i <- array) {
      sum += i
    }
    sum
  }

  def sumRec(array: Array[Int]): Int = {
    if (array.length == 0) {
      0
    } else {
      array.head + sumRec(array.tail)
    }
  }

  def fib(value: Int): BigInt = {
    if (value == 0) {
      0
    } else if (value == 1) {
      1
    } else {
      fib(value - 1) + fib(value - 2)
    }
  }
}
