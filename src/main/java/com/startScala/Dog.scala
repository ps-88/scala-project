package com.startScala

class Dog extends Animal {
  var age = 0

  override def makeSound(): Unit = println("gav")
}

object Dog{
  def apply(): Dog ={
    println("dog is created")
    val dog = new Dog()
    dog.age = 7
    dog
  }
}