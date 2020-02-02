package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare (that: Person): Int = {
    if (this.name == that.name) {
      this.age - that.age
    }
    else {
      this.name.length - that.name.length
    }
  }
}
object OrderedTraitForCompairingPerson extends App {
  val personOne = new Person("Test", 24)
  val personTwo = new Person("Test", 25)
  println(personOne < personTwo)
  
  val anotherPersonOne = new Person("TestAgain", 24)
  val anotherPersonTwo = new Person("Test", 25)
  println(anotherPersonOne < anotherPersonTwo)
  
}
