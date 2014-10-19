import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Player {

  class Mnt(val sx:Int, val h:Int)
  
  def main(args: Array[String]) {
    // game loop
    while(true) {
      val Array(sx, sy) = for (i <- readLine split " ") yield i.toInt

      val rng: List[Int] = List.range(0, 7)
      val mountains = rng.map((i) => new Mnt(i, readInt))

      val highest = mountains.filter(mnt => mnt.sx >= sx).maxBy(_.h)
      // Write an action using println
      // To debug: Console.err.println("Debug messages...")
      // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
      if (sx == highest) {
        println("FIRE")
      } else {
        println("HOLD")
      }
    }
  }
}
