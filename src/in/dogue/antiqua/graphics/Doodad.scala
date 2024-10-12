package in.dogue.antiqua.graphics

import in.dogue.antiqua.Antiqua.{Cell, TileGroup}

trait Doodad {
  val width:Int
  val height:Int
  def draw(pos:Cell)(tr:TileRenderer):TileRenderer
  def toTileGroup:TileGroup
}

