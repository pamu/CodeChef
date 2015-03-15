package com.codechef.problems.tsort

object Main {
  def main(args: Array[String]): Unit = {
    import java.io._
    val br = new BufferedReader(new InputStreamReader(System.in))
    val arr = Array.ofDim[Int](Math.pow(10, 6).asInstanceOf[Int] + 1)
    val tests = br.readLine().toInt
    var test = 0
    while(test < 0) {
      arr(br.readLine.toInt) += 1
      test += 1
    }
    var i = 0
    while(i < arr.length) {
      if(arr(i) != 0) {
        for(x <- 0 until arr(i)) {
          println(i)
        }
      }
      i += 1
    }
  }
}