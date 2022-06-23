package org.yaroshynska
package thr

import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext.Implicits.global

object ThreadPoolApp extends App {
  val threadPool = Executors.newFixedThreadPool(1)

  threadPool.execute(new Runnable{
    override def run(): Unit = ???
  })
  threadPool.execute(new Runnable{
    override def run(): Unit = println(Thread.currentThread().getName)
  })
  threadPool.execute(new Runnable{
    override def run(): Unit = println(Thread.currentThread().getName)
  })

  println(global)

//  Thread.sleep(1000)

  println("BUY!!!")
//  sys.exit(145)
}
