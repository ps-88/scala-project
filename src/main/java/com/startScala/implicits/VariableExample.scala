package com.startScala.implicits

object VariableExample {
  def printMe (implicit text:String,text2:String): Unit =println(text+" test "+text2)

}
