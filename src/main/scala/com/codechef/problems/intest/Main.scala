package com.codechef.problems.intest

object Main {
  def main(args: Array[String]): Unit = {
    import java.io._
    val reader = new BufferedReader(new InputStreamReader(System.in))
    val nk = reader.readLine.trim.split("\\s+").map(_.trim.toInt)
    var i = 0
    var count = 0
    if(nk(1) != 0)
    while(i < nk(0)) {
      if(reader.readLine.toInt % nk(1) == 0) {
        count += 1
      }
      i+= 1
    }
    reader.close
    println(count)
  }
}