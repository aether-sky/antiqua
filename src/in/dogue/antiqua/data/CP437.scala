package in.dogue.antiqua.data

import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import com.deweyvm.gleany.graphics.Color
import in.dogue.antiqua.graphics.{BorderCodePage, Tile}
import in.dogue.antiqua.Antiqua
import Antiqua._

//code page 437
//uppercase special characters are suffixed with _u due to the possible error:
// "Code$Ä$ differs only in case from Code$ä$. Such classes will overwrite one
// another on case-insensitive filesystems."

object CP437 {
  val All = ArrayBuffer[CP437]()

  val ☺          = CP437(  1, '☺', '\u263A')
  val ☻          = CP437(  2, '☻', '\u263B')
  val ♥          = CP437(  3, '♥', '\u2665')
  val ♦          = CP437(  4, '♦', '\u2666')
  val ♣          = CP437(  5, '♣', '\u2663')
  val ♠          = CP437(  6, '♠', '\u2660')
  val ●          = CP437(  7, '●', '\u2022')
  val ◘          = CP437(  8, '◘', '\u25D8')
  val ◦          = CP437(  9, '◦', '\u25CB')
  val ◙          = CP437( 10, '◙', '\u25D9')
  val ♂          = CP437( 11, '♂', '\u2642')
  val ♀          = CP437( 12, '♀', '\u2640')
  val ♪          = CP437( 13, '♪', '\u266A')
  val ♫          = CP437( 14, '♫', '\u266B')
  val ☼          = CP437( 15, '☼', '\u263C')
  val ►          = CP437( 16, '►', '\u25BA')
  val ◄          = CP437( 17, '◄', '\u25C4')
  val ↕          = CP437( 18, '↕', '\u2195')
  val `‼`        = CP437( 19, '‼', '\u203C')
  val `¶`        = CP437( 20, '¶', '\u00B6')
  val `§`        = CP437( 21, '§', '\u00A7')
  val `‗`        = CP437( 22, '‗', '\u25AC')
  val ↨          = CP437( 23, '↨', '\u21A8')
  val ↑          = CP437( 24, '↑', '\u2191')
  val ↓          = CP437( 25, '↓', '\u2193')
  val →          = CP437( 26, '→', '\u2192')
  val `←`        = CP437( 27, '←', '\u2190')
  val ∟          = CP437( 28, '∟', '\u221F')
  val ↔          = CP437( 29, '↔', '\u2194')
  val ▲          = CP437( 30, '▲', '\u25B2')
  val ▼          = CP437( 31, '▼', '\u25BC')
  val ` `        = CP437( 32, ' ', '\u0020')
  val !          = CP437( 33, '!', '\u0021')
  val `"`        = CP437( 34, '"', '\u0022')
  val `#`        = CP437( 35, '#', '\u0023')
  val $          = CP437( 36, '$', '\u0024')
  val %          = CP437( 37, '%', '\u0025')
  val &          = CP437( 38, '&', '\u0026')
  val `'`        = CP437( 39,'\'', '\u0027')
  val `(`        = CP437( 40, '(', '\u0028')
  val `)`        = CP437( 41, ')', '\u0029')
  val *          = CP437( 42, '*', '\u002A')
  val +          = CP437( 43, '+', '\u002B')
  val `,`        = CP437( 44, ',', '\u002C')
  val -          = CP437( 45, '-', '\u002D')
  val `.`        = CP437( 46, '.', '\u002E')
  val /          = CP437( 47, '/', '\u002F')
  val `0`        = CP437( 48, '0', '\u0030')
  val `1`        = CP437( 49, '1', '\u0031')
  val `2`        = CP437( 50, '2', '\u0032')
  val `3`        = CP437( 51, '3', '\u0033')
  val `4`        = CP437( 52, '4', '\u0034')
  val `5`        = CP437( 53, '5', '\u0035')
  val `6`        = CP437( 54, '6', '\u0036')
  val `7`        = CP437( 55, '7', '\u0037')
  val `8`        = CP437( 56, '8', '\u0038')
  val `9`        = CP437( 57, '9', '\u0039')
  val `:`        = CP437( 58, ':', '\u003A')
  val `;`        = CP437( 59, ';', '\u003B')
  val <          = CP437( 60, '<', '\u003C')
  val `=`        = CP437( 61, '=', '\u003D')
  val >          = CP437( 62, '>', '\u003E')
  val ?          = CP437( 63, '?', '\u003F')
  val `@`        = CP437( 64, '@', '\u0040')
  val A          = CP437( 65, 'A', '\u0041')
  val B          = CP437( 66, 'B', '\u0042')
  val C          = CP437( 67, 'C', '\u0043')
  val D          = CP437( 68, 'D', '\u0044')
  val E          = CP437( 69, 'E', '\u0045')
  val F          = CP437( 70, 'F', '\u0046')
  val G          = CP437( 71, 'G', '\u0047')
  val H          = CP437( 72, 'H', '\u0048')
  val I          = CP437( 73, 'I', '\u0049')
  val J          = CP437( 74, 'J', '\u004A')
  val K          = CP437( 75, 'K', '\u004B')
  val L          = CP437( 76, 'L', '\u004C')
  val M          = CP437( 77, 'M', '\u004D')
  val N          = CP437( 78, 'N', '\u004E')
  val O          = CP437( 79, 'O', '\u004F')
  val P          = CP437( 80, 'P', '\u0050')
  val Q          = CP437( 81, 'Q', '\u0051')
  val R          = CP437( 82, 'R', '\u0052')
  val S          = CP437( 83, 'S', '\u0053')
  val T          = CP437( 84, 'T', '\u0054')
  val U          = CP437( 85, 'U', '\u0055')
  val V          = CP437( 86, 'V', '\u0056')
  val W          = CP437( 87, 'W', '\u0057')
  val X          = CP437( 88, 'X', '\u0058')
  val Y          = CP437( 89, 'Y', '\u0059')
  val Z          = CP437( 90, 'Z', '\u005A')
  val `[`        = CP437( 91, '[', '\u005B')
  val \          = CP437( 92, '\\', '\\')
  val `]`        = CP437( 93, ']', '\u005D')
  val ^          = CP437( 94, '^', '\u005E')
  val underscore = CP437( 95, '_', '\u005F')
  val grave      = CP437( 96, '`', '\u0060')
  val a          = CP437( 97, 'a', '\u0061')
  val b          = CP437( 98, 'b', '\u0062')
  val c          = CP437( 99, 'c', '\u0063')
  val d          = CP437(100, 'd', '\u0064')
  val e          = CP437(101, 'e', '\u0065')
  val f          = CP437(102, 'f', '\u0066')
  val g          = CP437(103, 'g', '\u0067')
  val h          = CP437(104, 'h', '\u0068')
  val i          = CP437(105, 'i', '\u0069')
  val j          = CP437(106, 'j', '\u006A')
  val k          = CP437(107, 'k', '\u006B')
  val l          = CP437(108, 'l', '\u006C')
  val m          = CP437(109, 'm', '\u006D')
  val n          = CP437(110, 'n', '\u006E')
  val o          = CP437(111, 'o', '\u006F')
  val p          = CP437(112, 'p', '\u0070')
  val q          = CP437(113, 'q', '\u0071')
  val r          = CP437(114, 'r', '\u0072')
  val s          = CP437(115, 's', '\u0073')
  val t          = CP437(116, 't', '\u0074')
  val u          = CP437(117, 'u', '\u0075')
  val v          = CP437(118, 'v', '\u0076')
  val w          = CP437(119, 'w', '\u0077')
  val x          = CP437(120, 'x', '\u0078')
  val y          = CP437(121, 'y', '\u0079')
  val z          = CP437(122, 'z', '\u007A')
  val `{`        = CP437(123, '{', '\u007B')
  val |          = CP437(124, '|', '\u007C')
  val `}`        = CP437(125, '}', '\u007D')
  val ~          = CP437(126, '~', '\u007E')
  val ⌂          = CP437(127, '⌂', '\u007F')
  val Ç_u        = CP437(128, 'Ç', '\u00C7')
  val ü          = CP437(129, 'ü', '\u00FC')
  val é          = CP437(130, 'é', '\u00E9')
  val â          = CP437(131, 'â', '\u00E2')
  val ä          = CP437(132, 'ä', '\u00E4')
  val à          = CP437(133, 'à', '\u00E0')
  val å          = CP437(134, 'å', '\u00E5')
  val ç          = CP437(135, 'ç', '\u00E7')
  val ê          = CP437(136, 'ê', '\u00EA')
  val ë          = CP437(137, 'ë', '\u00EB')
  val è          = CP437(138, 'è', '\u00E8')
  val ï          = CP437(139, 'ï', '\u00EF')
  val î          = CP437(140, 'î', '\u00EE')
  val ì          = CP437(141, 'ì', '\u00EC')
  val Ä_u        = CP437(142, 'Ä', '\u00C4')
  val Å_u        = CP437(143, 'Å', '\u00C5')
  val É_u        = CP437(144, 'É', '\u00C9')
  val æ          = CP437(145, 'æ', '\u00E6')
  val Æ_u        = CP437(146, 'Æ', '\u00C6')
  val ô          = CP437(147, 'ô', '\u00F4')
  val ö          = CP437(148, 'ö', '\u00F6')
  val ò          = CP437(149, 'ò', '\u00F2')
  val û          = CP437(150, 'û', '\u00FB')
  val ù          = CP437(151, 'ù', '\u00F9')
  val ÿ          = CP437(152, 'ÿ', '\u00FF')
  val Ö_u        = CP437(153, 'Ö', '\u00D6')
  val Ü_u        = CP437(154, 'Ü', '\u00DC')
  val `¢`        = CP437(155, '¢', '\u00A2')
  val `£`        = CP437(156, '£', '\u00A3')
  val `¥`        = CP437(157, '¥', '\u00A5')
  val `₧`        = CP437(158, '₧', '\u20A7')
  val ƒ          = CP437(159, 'ƒ', '\u0192')
  val á          = CP437(160, 'á', '\u00E1')
  val í          = CP437(161, 'í', '\u00ED')
  val ó          = CP437(162, 'ó', '\u00F3')
  val ú          = CP437(163, 'ú', '\u00FA')
  val ñ          = CP437(164, 'ñ', '\u00F1')
  val Ñ_u        = CP437(165, 'Ñ', '\u00D1')
  val ª          = CP437(166, 'ª', '\u00AA')
  val º          = CP437(167, 'º', '\u00BA')
  val `¿`        = CP437(168, '¿', '\u00BF')
  val ⌐          = CP437(169, '⌐', '\u2310')
  val ¬          = CP437(170, '¬', '\u00AC')
  val `½`        = CP437(171, '½', '\u00BD')
  val `¼`        = CP437(172, '¼', '\u00BC')
  val `¡`        = CP437(173, '¡', '\u00A1')
  val `«`        = CP437(174, '«', '\u00AB')
  val `»`        = CP437(175, '»', '\u00BB')
  val ░          = CP437(176, '░', '\u2591')
  val ▒          = CP437(177, '▒', '\u2592')
  val ▓          = CP437(178, '▓', '\u2593')
  val │          = CP437(179, '│', '\u2502')
  val ┤          = CP437(180, '┤', '\u2524')
  val ╡          = CP437(181, '╡', '\u2561')
  val ╢          = CP437(182, '╢', '\u2562')
  val ╖          = CP437(183, '╖', '\u2556')
  val ╕          = CP437(184, '╕', '\u2555')
  val ╣          = CP437(185, '╣', '\u2563')
  val ║          = CP437(186, '║', '\u2551')
  val ╗          = CP437(187, '╗', '\u2557')
  val ╝          = CP437(188, '╝', '\u255D')
  val ╜          = CP437(189, '╜', '\u255C')
  val ╛          = CP437(190, '╛', '\u255B')
  val ┐          = CP437(191, '┐', '\u2510')
  val └          = CP437(192, '└', '\u2514')
  val ┴          = CP437(193, '┴', '\u2534')
  val ┬          = CP437(194, '┬', '\u252C')
  val ├          = CP437(195, '├', '\u251C')
  val ─          = CP437(196, '─', '\u2500')
  val ┼          = CP437(197, '┼', '\u253C')
  val ╞          = CP437(198, '╞', '\u255E')
  val ╟          = CP437(199, '╟', '\u255F')
  val ╚          = CP437(200, '╚', '\u255A')
  val ╔          = CP437(201, '╔', '\u2554')
  val ╩          = CP437(202, '╩', '\u2569')
  val ╦          = CP437(203, '╦', '\u2566')
  val ╠          = CP437(204, '╠', '\u2560')
  val ═          = CP437(205, '═', '\u2550')
  val ╬          = CP437(206, '╬', '\u256C')
  val ╧          = CP437(207, '╧', '\u2567')
  val ╨          = CP437(208, '╨', '\u2568')
  val ╤          = CP437(209, '╤', '\u2564')
  val ╥          = CP437(210, '╥', '\u2565')
  val ╙          = CP437(211, '╙', '\u2559')
  val ╘          = CP437(212, '╘', '\u2558')
  val ╒          = CP437(213, '╒', '\u2552')
  val ╓          = CP437(214, '╓', '\u2553')
  val ╫          = CP437(215, '╫', '\u256B')
  val ╪          = CP437(216, '╪', '\u256A')
  val ┘          = CP437(217, '┘', '\u2518')
  val ┌          = CP437(218, '┌', '\u250C')
  val █          = CP437(219, '█', '\u2588')
  val ▄          = CP437(220, '▄', '\u2584')
  val ▌          = CP437(221, '▌', '\u258C')
  val ▐          = CP437(222, '▐', '\u2590')
  val ▀          = CP437(223, '▀', '\u2580')
  val α          = CP437(224, 'α', '\u03B1')
  val β          = CP437(225, 'β', '\u00DF')
  val Γ          = CP437(226, 'Γ', '\u0393')
  val π          = CP437(227, 'π', '\u03C0')
  val Σ_u        = CP437(228, 'Σ', '\u03A3')
  val σ          = CP437(229, 'σ', '\u03C3')
  val μ          = CP437(230, 'μ', '\u00B5')
  val τ          = CP437(231, 'τ', '\u03C4')
  val Φ          = CP437(232, 'Φ', '\u03A6')
  val Θ          = CP437(233, 'Θ', '\u0398')
  val Ω          = CP437(234, 'Ω', '\u03A9')
  val δ          = CP437(235, 'δ', '\u03B4')
  val ∞          = CP437(236, '∞', '\u221E')
  val φ          = CP437(237, 'φ', '\u03C6')
  val ϵ          = CP437(238, 'ϵ', '\u03B5')
  val ∩          = CP437(239, '∩', '\u2229')
  val ≡          = CP437(240, '≡', '\u2261')
  val ±          = CP437(241, '±', '\u00B1')
  val ≥          = CP437(242, '≥', '\u2265')
  val ≤          = CP437(243, '≤', '\u2264')
  val ⌠          = CP437(244, '⌠', '\u2320')
  val ⌡          = CP437(245, '⌡', '\u2321')
  val ÷          = CP437(246, '÷', '\u00F7')
  val ≈          = CP437(247, '≈', '\u2248')
  val °          = CP437(248, '°', '\u00B0')
  val ▪          = CP437(249, '▪', '\u2219')
  val `·`        = CP437(250, '·', '\u00B7')
  val √          = CP437(251, '√', '\u221A')
  val ⁿ          = CP437(252, 'ⁿ', '\u207F')
  val `²`        = CP437(253, '²', '\u00B2')
  val ■          = CP437(254, '■', '\u25A0')

  def notBlank(c:Tile):Boolean = c.code != ` `.toCode

  def codeToUnicode(code:Char):Char = {
    if (code < 1 || code > 253) {
      '?'
    } else {
      All(code-1).unicode
    }
  }

  def intToCode(i:Int):CP437 = {
    if (i < 1 || i > 253) {
      CP437.` `
    } else {
      All(i-1)
    }
  }

  def unicodeToCode(s:Char):Code = {
    (All.find(_.unicode == s) getOrElse CP437.?).toCode
  }

  val doubleBorder = new BorderCodePage(
    CP437.║, CP437.═, CP437.╔, CP437.╗, CP437.╚, CP437.╝
  )
  
  val singleBorder = new BorderCodePage(
    CP437.│, CP437.─, CP437.┌, CP437.┐, CP437.└, CP437.┘
  )
}

case class CP437(index:Int, char:Char='?', unicode:Char) {
  if (CP437.All.length < 255) {
    CP437.All += this
    ()
  }

  def rawString = index.toChar.toString

}


