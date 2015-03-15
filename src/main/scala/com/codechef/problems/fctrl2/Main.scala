package com.codechef.problems.fctrl2

object Main {
  def main(args: Array[String]): Unit = {
    import java.io._
    val reader = new BufferedReader(new InputStreamReader(System.in))
    val tests = reader.readLine.toInt
    for(i <- 1 to tests) {
      println(fac(BigInt(reader.readLine)))
    }
  }
  def fac(n: BigInt): BigInt = {
    def helper(a: BigInt, pro: BigInt): BigInt = if(a > n) pro else helper(a + 1, pro * a)
    helper(1, 1)
  }
}