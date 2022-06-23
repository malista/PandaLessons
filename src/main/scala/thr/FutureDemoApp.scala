package org.yaroshynska
package thr

import java.io.{File, FileNotFoundException}
import java.util.concurrent.{ExecutorService, Executors}
import scala.concurrent.{Await, ExecutionContext, ExecutionContextExecutorService, Future}
import scala.concurrent.duration._

object FutureDemoApp extends App {
  implicit val threadPool: ExecutionContext = ExecutionContext
    .fromExecutorService(Executors.newFixedThreadPool(1))

  val intFut: Future[Int] = Future{
    Thread.sleep(2000)
    13
  }

  val f2 = intFut.map(r => r * 1000)

  f2.foreach(e => println(e))
  val f3: Future[Int] = intFut.flatMap(e => Future(e * 20))
}
