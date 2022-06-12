package org.yaroshynska
package thr

class RabbidzRushThread(num: Int, сьінНомер: Int) extends Runnable{
  override def run(): Unit = {
    println(s"Родитель кроликов: $num дите ${сьінНомер}")
    new Thread(new RabbidzRushThread(num + 1, 1)).start()
    new Thread(new RabbidzRushThread(num + 1, 2)).start()
    new Thread(new RabbidzRushThread(num + 1, 3)).start()
    println(s"родитель $num дите ${сьінНомер} кроликов издох")
  }
}

object RabbidzRush extends App {
  new RabbidzRushThread(0, 0).run()
}
