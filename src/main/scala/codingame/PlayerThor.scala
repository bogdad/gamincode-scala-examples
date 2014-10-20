import math._
import scala.util._

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
object Player {

  def main(args: Array[String]) {
    // lx: the X position of the light of power
    // ly: the Y position of the light of power
    // tx: Thor's starting X position
    // ty: Thor's starting Y position

    def sgn(a : Int) : Int = {
      if (a > 0) 1 else if (a == 0) 0 else -1
    }

    val Array(lx, ly, tx, ty) = for(i <- readLine split " ") yield i.toInt
    var cx = tx;
    var cy = ty;

    // game loop
    while(true) {
      val e = readInt // The level of Thor's remaining energy, representing the number of moves he can still make.

      // Write an action using println
      // To debug: Console.err.println("Debug messages...")
      val dx = sgn(lx - cx)
      val dy = sgn(ly - cy)

      val dir = if (dx > 0) {
        if (dy > 0) "SE" else if (dy == 0) "E" else "NE"
      } else if (dx == 0) {
        if (dy > 0) "S" else if (dy == 0) "" else "N"
      } else {
        if (dy > 0) "SW" else if (dy == 0) "W" else "NW"
      }
      Console.err.println(dx + " " + dy + " ");
      Console.err.println(lx + " " + ly);
      Console.err.println(tx + " " + ty);

      if (dir.length() > 0)
        println(dir) // A single line providing the move to be made: N NE E SE S SW W or NW

      cx = cx + dx
      cy = cy + dy
    }
  }
}
