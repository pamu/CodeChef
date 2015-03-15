package com.codechef.problems.tsort

object Main {
  def main(args: Array[String]): Unit = {
    
    import java.io._
    val br = new BufferedReader(new InputStreamReader(System.in))
    
    val in = new BufferedInputStream(System.in)
    
    while(in.available() != -1) {
      val c = in.read
      var counter = 0
      if(c == ' ') {
       counter = 0   
      }else if(c.isValidInt) {
        
      }
    }
    
    val arr = Array.ofDim[Int](Math.pow(10, 6).asInstanceOf[Int] + 1)
    
    val tests = br.readLine().toInt
    
    var test = 0
    
    var max = Int.MinValue
    var min = Int.MaxValue
    
    while(test < tests) {
      val current = br.readLine.toInt
      if(current < min) min = current
      if(current > max) max = current
      arr(current) += 1
      test += 1
    }
    
    var i = min  
    while(i <= max) {
      if(arr(i) != 0) {
        for(x <- 0 until arr(i)) println(i) 
      }
      i += 1
    }
    
  }
}