package com.startScala

object AnimalFactory {

  def apply(): Animal = new Dog

  def main(args: Array[String]): Unit = {
    val dog  = new Dog()
    print(dog.age)

  }
}
