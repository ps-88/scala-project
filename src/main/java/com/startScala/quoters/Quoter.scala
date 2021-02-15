package com.startScala.quoters

import com.github.javafaker.Faker

trait Quoter {
  def sayMessage():Unit

}

case class MessageQuoter (message:String) extends Quoter {
  override def sayMessage(): Unit = println(message)
}

class ShakespeareQuoter (message:String="2 b || ! 2 b") extends Quoter {
  override def sayMessage(): Unit = println(message)
}



object RandomQuoter extends Quoter {

  val faker = new Faker()

  override def sayMessage(): Unit = println(faker.chuckNorris().fact())
}

class  QuoterAggregator (quoters:List[Quoter]){

  def sayAll(): Unit={
    quoters.foreach(_.sayMessage())
  }
}