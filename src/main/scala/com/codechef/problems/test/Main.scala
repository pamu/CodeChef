package com.codechef.problems.test

object Main {
  def main(args: Array[String]): Unit = {
    import java.io._
    val reader = new BufferedReader(new InputStreamReader(System.in))
    try{
      while(true) {
        val c = reader.readLine.toInt
        if(c == 42) throw new Exception("stop") else println(c)
      }
    }
    catch {
      case ex: Exception =>  
    } 
  }
}