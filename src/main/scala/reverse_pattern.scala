//object reverse_pattern {
//  def main(args:Array[String]):Unit={
//
//    for(i<- 5 to 1  by -1){
//      for(j<-i to 1 by -1){
//        print(j+" ")
//      }
//      println()
//    }
//  }
//
//}


// print number from 1 to 5 using a "for" loop
//
//object num{
//  def main(args:Array[String]):Unit={
//    for(i<-1 to 5){
//      print(i+" ")
//    }
//  }
//}


//Print even numbers from 2 to 10 using a "while" loop
//object prime_num{
//  def main(args:Array[String]):Unit={
//    var num=2
//    while(num<=20){
//      if (num%2==0){
//        print(num+" ")
//      }
//      num=num+1
//    }
//  }
//  }


//Calculate the sum of all numbers from 1 to 50 using a "for" loop
//object sum{
//  def main(args:Array[String]):Unit={
//   var sum=0
//    for(i<-1 to 50){
//      sum=sum+i
//    }
//    print(sum)
//  }
//}

//Print the square of numbers from 1 to 5 using a "for" loop
//object square{
//  def main(args:Array[String]):Unit={
//
//    for (i<-1 to 5){
//      val sq=i*i
//      println(sq)
//    }
//  }
//}


//Generate and print the first 5 multiples of 3 using a "for" loop
//object mult{
//  def main(args:Array[String]):Unit={
//    var mul=1
//    for (i<-1 to 5){
//      mul=3*i
//      print(mul+" ")
//    }
//  }
//}

////Print the reverse of a given list using a "while" loop.
//object reverse{
//  def main(args:Array[String]):Unit={
//    val list=[1,2,3,4,5,6]
//
//  }
//}

// Print odd numbers from 1 to 15 using a "while" loop
//object odd{
//  def main(args:Array[String]):Unit={
//   var n=1
//    while(n<=15){
//      if(n%2 !=0){
//        println("odd "+n+" ")
//      }
//      n=n+1
//    }
//  }
//}


//Factorial of number
//object factorial{
//  def main(args: Array[String]): Unit ={
//    val num: Int= scala.io.StdIn.readInt()
//    var fact=1
//    for(i<-1 to num){
//      fact=fact*i
//
//    }
//    println("factorial of "+num+" is "+ fact)
//  }
//}


//print a pattern

//object pattern{
//  def main(args: Array[String]): Unit ={
//    for (i<-1 to 5){
//      for(j<-1 to i){
//
//        print(j+" ")
//      }
//      println()
//    }
//  }
//}
//OUtput
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

// pattern 2

//object pattern{
//  def main(args: Array[String]): Unit ={
//  var num=1
//    for(i<-1 to 5){
//      for(j<-1 to i) {
//        print(num+" ")
//        num=num+1
//      }
//      println()
//    }
//  }
//}
//output
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

//
//object pattern{
//  def main(args: Array[String]): Unit = {
//    for(i<- 1 to 5) {
//      for (j <- 1 to i) {
//        print(i + " ")
//      }
//      println()
//    }
//  }
//}
//output
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5


//Right angle pattern
//object rightang{
//  def main(args: Array[String]): Unit ={
//    for(i<-1 to 5){
//      for(j<-1 to i){
//        print("*"+" ")
//      }
//      println()
//    }
//  }
//}

//output
//*
//* *
//* * *
//* * * *
//* * * * *

// Square pattern
//object squarepattern{
//  def main(args: Array[String]): Unit ={
//    for(i<-1 to 5){
//      for(j<-1 to 5){
//        print("*"+" ")
//      }
//      println()
//    }
//
//  }
//}
////output
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *


//reverse
//object reverse_pattern {
//  def main(args:Array[String]):Unit={
//
//    for(i<- 5 to 1  by -1){
//      for(j<-1 to i){
//        print("*"+" ")
//      }
//      println()
//    }
//  }
//}
//output
//* * * * *
//* * * *
//* * *
//* *
//*

