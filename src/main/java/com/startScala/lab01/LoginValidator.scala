package com.startScala.lab01

object LoginValidator {

  def validate(login: NewLogin): String = {

    val result: String = login match {
      case NewLogin("admin", _, _) => s"name can't be 'admin' "
      case NewLogin(_, password, _) if password.contains("z") => s"Password can't contain 'z' $password"
      case NewLogin(userName, password, _) if userName == password => s"user and pass are the same: $userName"
      case NewLogin(_, password, _) if password.forall(_.isDigit) => "pass can't be only digits"
      case NewLogin(_, password, confirmPassword) if password != confirmPassword => s"pass $password is not equals to confirmation: $confirmPassword"
      case _ => "login is ok"
    }


    result


    //    if (login.userName == "admin") {
    //      println("name can't be 'admin'" + login.userName)
    //    } else if (login.password.startsWith("z")) {
    //      println("Password  can't start from 'z' " + login.password)
    //    } else if (login.password == login.userName) {
    //      println("Password  can't equal to username " + login.userName)
    //    }
  }
}
