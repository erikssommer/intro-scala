import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

// Write in Scala an example of a deadlock using lazy val
// https://www.baeldung.com/scala/lazy-val

object Deadlock extends App {
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
