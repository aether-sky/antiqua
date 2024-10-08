package in.dogue.antiqua.geometry

import com.deweyvm.gleany.data.Point2d
import in.dogue.antiqua.Antiqua
import Antiqua._
import scala.collection.mutable.ArrayBuffer
object Line {
  @inline def bresenhamTup(s:Cell, d:Cell) = bresenham(s._1, s._2, d._1, d._2)
  def bresenham(sx:Int, sy:Int, endX:Int, endY:Int):Seq[(Int,Int)] = {
    var startX = sx
    var startY = sy
    val w = endX - startX
    val h = endY - startY
    var dx1 = 0
    var dy1 = 0
    var dx2 = 0
    var dy2 = 0
    if (w < 0) {
      dx1 = -1
      dx2 = -1
    } else if (w > 0) {
      dx1 = 1
      dx2 = 1
    }
    if (h < 0) {
      dy1 = -1
    } else if (h > 0) {
      dy1 = 1
    }
    import scala.math.abs
    var longest = abs(w)
    var shortest = abs(h)
    if (longest <= shortest) {
      longest = abs(h)
      shortest = abs(w)
      if (h < 0) {
        dy2 = -1
      } else if (h > 0) {
        dy2 = 1
      }
      dx2 = 0
    }
    val output = ArrayBuffer[(Int,Int)]()
    var numerator = longest >> 1
    for (i <- 0 to longest) {
      val point = (startX, startY)
      output += point
      numerator += shortest
      if (numerator > longest) {
        numerator -= longest
        startX += dx1
        startY += dy1
      } else {
        startX += dx2
        startY += dy2
      }
    }
    output.toSeq
  }
}
case class Line(p:Point2d, q:Point2d) {
  def this(x1:Double, y1:Double, x2:Double, y2:Double) = this(Point2d(x1, y1), Point2d(x2, y2))

  lazy val length = (q - p).magnitude

  def translate(pt:Point2d) = Line(p + pt, q + pt)



  /**
   * returns point if lines are touching only at endpoints or intersecting
   * @param other
   * @return
   */
  def intersectPointEnd(other:Line):Option[Point2d] = {
    val s10_x = q.x - p.x
    val s10_y = q.y - p.y
    val s32_x = other.q.x - other.p.x
    val s32_y = other.q.y - other.p.y

    val denom = s10_x * s32_y - s32_x * s10_y
    if (denom == 0) {
      return None // Collinear
    }
    if (other.getAdjacent(p).isDefined) {
      p.some
    } else if (other.getAdjacent(q).isDefined) {
      q.some
    } else {
      intersectPoint(other)
    }
  }


  //http://stackoverflow.com/a/14795484/892213
  private def intersectPoint(other:Line):Option[Point2d] = {

    val s10_x = q.x - p.x
    val s10_y = q.y - p.y
    val s32_x = other.q.x - other.p.x
    val s32_y = other.q.y - other.p.y

    val denom = s10_x * s32_y - s32_x * s10_y
    if (denom == 0)
      return None // Collinear

    val denomPositive = denom > 0

    val s02_x = p.x - other.p.x
    val s02_y = p.y - other.p.y
    val s_numer = s10_x * s02_y - s10_y * s02_x
    if ((s_numer < 0) == denomPositive)
      return None // No collision

    val t_numer = s32_x * s02_y - s32_y * s02_x
    if ((t_numer < 0) == denomPositive)
      return None // No collision

    if (((s_numer > denom) == denomPositive) || ((t_numer > denom) == denomPositive))
      return None // No collision
    // Collision detected
    val t = t_numer / denom
    Point2d(p.x + (t * s10_x), p.y + (t * s10_y)).some

  }



  def clockSign(other:Line):Int = {
    val p1 = p - q
    val p2 = -(other.p - other.q)
    math.signum((p1.to3 × p2.to3).z).toInt
  }

  def crossZ(other:Line):Double = {
    val p1 = p - q
    val p2 = -(other.p - other.q)
    (p1.to3 × p2.to3).z
  }

  def clockAngle(other:Line):Double = {
    val p1 = (p - q).normalize
    val p2 = (other.p - other.q).normalize
    math.acos(-p1 dot p2)
  }

  //Line must be reoriented such that the back is the start point and the front is the end point
  def getAdjacent(pt:Point2d):Option[Line] = {
    if (pt == p) {
      this.some
    } else if (pt == q) {
      Line(q,p).some
    } else {
      None
    }
  }

  def getAdjacentEpsilon(pt:Point2d, epsilon:Double):Option[Line] = {
    if ((pt - p).magnitude2 < epsilon) {
      this.some
    } else if ((pt - q).magnitude2 < epsilon) {
      Line(q,p).some
    } else {
      None
    }
  }

  override def equals(obj:Any) = {
    if (!obj.isInstanceOf[Line]) {
      false
    } else {
      val other = obj.asInstanceOf[Line]
      (other.p == p && other.q == q) || (other.q == p && other.p == q)

    }
  }

  override def hashCode() = {
    super.hashCode()
    def toD(d:Double):Int = java.lang.Double.doubleToRawLongBits(d).toInt
    val const = 71
    List(p.x, p.y, q.x, q.y).foldLeft(const) {case (acc:Int, i:Double) => acc*const + toD(i)}

  }

  def scale(s:Double) = {
    copy(p = p*s, q = q*s)
  }

  override def toString = "<%.2f,%.2f --- %.2f,%.2f>" format (p.x, p.y, q.x, q.y)
}
