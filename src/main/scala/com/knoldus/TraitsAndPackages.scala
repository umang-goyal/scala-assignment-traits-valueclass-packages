package com.knoldus


  trait Queue{
    def enqueue(list: List[Int],newData:Int):List[Int]

    def dequeue(list:List[Int]):List[Int]=
    {
      list.tail
    }
  }
  class DoubleQueue extends  Queue {
    override  def enqueue(list : List[Int],newData :Int):List[Int]={
      list:+newData*2
    }

  }

  class SquareQueue extends  Queue {
    override  def enqueue(list : List[Int],newData :Int):List[Int]={
      list:+newData*newData
    }

  }
object TraitsAndPackages extends App {
  val list = List(5, 6, 7)
  val doubleQ = new DoubleQueue
  val squareQ = new SquareQueue

  println(doubleQ.enqueue(list, 6))
  println(squareQ.enqueue(list, 6))
  println(squareQ.enqueue(list, 3))
  println(doubleQ.dequeue(list))

}