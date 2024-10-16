package in.dogue.antiqua

import com.deweyvm.gleany.graphics.Color
import in.dogue.antiqua.data.*
import in.dogue.antiqua.graphics.{Animation, Tile}
import in.dogue.antiqua.data.aug.*

object Antiqua {
  type TileGroup = Seq[(Cell,Tile)]
  extension (s: String)
    def toTileGroup(bg:Color, fg:Color):TileGroup = {
      s.zipWithIndex.map { (c, i) => ((i, 0), CP437.unicodeToCode(c).mkTile(bg, fg)) }

    }
  type AnimationGroup = Seq[(Cell,Animation)]
  type Vox = (Int,Int,Int)
  type Cell = (Int,Int)
  implicit def any2Aug[A](a: => A): AugAny[A] = new AugAny(a)
  implicit def opt2Aug[A](o:Option[A]): AugOption[A] = new AugOption(o)
  implicit def bool2Aug(b:Boolean): AugBool = new AugBool(b)
  implicit def indexedSeq2Aug[A](s:IndexedSeq[A]): AugIndexedSeq[A] = new AugIndexedSeq(s)
  implicit def indexedSeq2AugProb[A](s:IndexedSeq[(Int, A)]): AugIndexedProb[A] = new AugIndexedProb(s)
  implicit def num2Aug[A](a:A)(implicit n: Numeric[A]): AugNum[A] = new AugNum(a)
  implicit def seq2AugCellSeq[A](seq:Seq[(Cell,A)]): AugCellSeq[A] = new AugCellSeq(seq)
  implicit def intTup2Aug[A](tup:(Int,Int)): AugIntPair = new AugIntPair(tup)
  implicit def intTrip2Aug[A](trip:(Int,Int,Int)): AugIntTriple = new AugIntTriple(trip)
  implicit def int2Aug(i:Int): AugInt = new AugInt(i)
  implicit def dub2Aug(i:Double): AugDouble = new AugDouble(i)
  implicit def cp437_2Code(cp:CP437): Code = new Code(cp.index)
  implicit def sameTup2_2Aug[A](tup:(A,A)): AugSamePair[A] = new AugSamePair(tup)
  implicit def tup2_2AugTup[A,B](tup:(A,B)): AugTuple2[A, B] = new AugTuple2(tup)
  implicit def tup3_2AugTup[A,B,C](tup:(A,B,C)): AugTuple3[A, B, C] = new AugTuple3(tup)
  implicit def tup4_2AugTup[A,B,C,D](tup:(A,B,C,D)): AugTuple4[A, B, C, D] = new AugTuple4(tup)
  implicit def tup5_2AugTup[A,B,C,D,E](tup:(A,B,C,D,E)): AugTuple5[A, B, C, D, E] = new AugTuple5(tup)
  implicit def array2dPair2Aug[A,B](a:Array2d[(A,B)]): AugArray2dPair[A, B] = new AugArray2dPair(a)
  implicit def seq2Aug[T](s:Seq[T]): AugSeq[T] = new AugSeq(s)
  implicit def list2Aug[T](t:List[T]): AugList[T] = new AugList(t)
  implicit def set2Aug[A](a:Set[A]): AugSet[A] = new AugSet(a)
  implicit def vec2Aug[A](a:Vector[A]): AugVector[A] = new AugVector(a)
  implicit def array2d2AugArray2d[A](arr:Array2d[A]): AugArray2d[A] = new AugArray2d(arr)
  @inline def id[T](t:T) = t

  def impossible = throw new Exception("Impossible")

}
