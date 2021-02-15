package com.startScala.quoters

object MainQuoters {

  def main(args: Array[String]): Unit = {

    val aggregator = new QuoterAggregator(List(RandomQuoter, new ShakespeareQuoter(), MessageQuoter("message")))
    aggregator.sayAll()

  }
}
