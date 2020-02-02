package com.knoldus

class FirstName(val firstName: String) extends AnyVal{
  def get = firstName
}
class LastName(val lastName: String) extends AnyVal{
  def get = lastName
}
class Age(val age: Int) extends AnyVal{
  def get = age
}

object displayDetails extends App {
  def displayDetails(firstName: FirstName, lastName: LastName, age: Age): Unit = {
    println(firstName.get + " " + lastName.get + " is of " + age.get + " years")
  }

  val first = new FirstName("umang")
  val last = new LastName("goyal")
  val age = new Age(22)
  print(displayDetails(first, last, age ))
}
