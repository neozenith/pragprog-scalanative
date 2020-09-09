import scala.scalanative.unsafe._
import scala.scalanative.libc._

object Main {
  def main(args: Array[String]) {
    Zone { implicit z =>
      stdio.vprintf(c"Hello native %s!\n", toCVarArgList(c"world"))
    }
  }
}
