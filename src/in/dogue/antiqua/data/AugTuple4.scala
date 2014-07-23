package in.dogue.antiqua.data

class AugTuple4[A,B,C,D](t:(A, B, C, D)) {
  def map1[K](f:A => K) = t.copy(_1=f(t._1))
  def map2[K](f:B => K) = t.copy(_2=f(t._2))
  def map3[K](f:C => K) = t.copy(_3=f(t._3))
  def map4[K](f:D => K) = t.copy(_4=f(t._4))
}
