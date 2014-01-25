package org.xikilze

import grizzled.slf4j.Logger
import akka.actor.{ Props, Actor, ActorSystem }
import com.typesafe.config.ConfigFactory

class TestActor extends Actor {
	val log = Logger[this.type]

  def receive = {
    case str : String =>
      log.info("Message reçu : " + str)
  }
}

object AkkaReceiver extends App {
	val log = Logger[this.type]

  val system = ActorSystem("app")
  val actor = system.actorOf(Props[TestActor], "testActor")
  log.info("Attende de messsages")
}
