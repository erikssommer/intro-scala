import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

// Scala example of a deadlock using lazy val
// https://www.baeldung.com/scala/lazy-val

object Deadlock {
  def run: Seq[Int] = {
    val result = Future.sequence(Seq(
      Future {
        Foo.start
      },
      Future {
        Bar.initialState
      }
    ))
    Await.result(result, 5.second)
  }

  run
}
