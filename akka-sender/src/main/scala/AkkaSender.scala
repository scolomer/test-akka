package org.xikilze

import grizzled.slf4j.Logger

import akka.actor._


object AkkaSender extends App {
	val log = Logger[this.type]

  val system = ActorSystem("app")
  log.info("Connexion distante")
  val actor = system.actorSelection("akka.tcp://app@127.0.0.1:2552/user/testActor")
  log.info("Envoi du message")

  actor ! "Hello"

  log.info("Fin")
  // system.shutdown();
}
