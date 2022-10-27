class Concurrency {
  // a) Create a function that takes as argument a function and returns a Thread initialized with the input function.
  // Make sure that the returned thread is not started.
  def thread(func: => Unit): Thread = {
    new Thread {
      override def run() = { func }
    }
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
}
