package com.codechef.problems.holes

object Main {
  def main(args: Array[String]): Unit = {
    val holes = Map[Char, Int](
        'A' -> 1, 'B' -> 2, 'C' -> 0, 'D' -> 1, 'E' -> 0, 'F' -> 0, 'G' -> 0, 'H' -> 0, 'I' -> 0,
        'J' -> 0, 'K' -> 0, 'L' -> 0, 'M' -> 0, 'N' -> 0, 'O' -> 1, 'P' -> 1, 'Q' -> 1, 'R' -> 1,
        'S' -> 0, 'T' -> 0, 'U' -> 0, 'V' -> 0, 'W' -> 0, 'X' -> 0, 'Y' -> 0, 'Z' -> 0)
    import java.io._
    val reader = new BufferedReader(new InputStreamReader(System.in))
    val tests = reader.readLine.toInt
    var i = 0
    while(i < tests) {
      //println((for(c <- reader.readLine) yield holes(c)).sum)
      var j = 0
      val str = reader.readLine
      var count = 0
      while(j < str.length) {
        count += holes(str.charAt(j))
        j += 1
      }
      println(count)
      i += 1
    }
  }
}