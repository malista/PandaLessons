package org.yaroshynska
package thr


def printCurrentThread(currThread: Thread) = {
  println(s"""Current thread name: "${currThread.getName}"""")

}

val runnable: Runnable = new Runnable {
  override def run(): Unit = {
    new Thread(() => {
      val e = 1212312
      println(Thread.currentThread().getName + e)
    }).start()

    printCurrentThread(Thread.currentThread())
  }
}

object ThreadMain extends App {
  new Thread(runnable).start()

  println(s"${Thread.currentThread().getName} Done")
}
