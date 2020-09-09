import scala.scalanative.unsafe._
import scala.scalanative.libc._

object Main {
  def main(args: Array[String]) {
    stdio.printf(c"Hello native %s!\n", c"world")
  }
}
