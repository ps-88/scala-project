package com.startScala.lab01

object Main {

  def main(args: Array[String]): Unit = {

    val login = NewLogin(userName = "Jack", password = "123f34", confirmPassword = "123f34")
    val str = LoginValidator.validate(login)
    println(str.toUpperCase)
  }
}
