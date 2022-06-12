package org.yaroshynska

//@main
//def hello_world =
//  println("Hello Kitty")

case class ShepherdDog(name: String, age: Int, owner: Option[Owner]) {
  def embrace(ownerToHug: Owner): Unit = {
    if (isTheOwner(ownerToHug)){
      println("Овчарка обняла своего хозяина")
    } else {
      println("Не тот хозяин")
    }
  }
  
  def isTheOwner(possibleOwner: Owner): Boolean = 
    owner.exists(ow => ow.name == possibleOwner.name)
}

class Owner(val name: String)

object start extends App {
  //for(j <- 1 until 10){
  //  println("oooo")
  //  }

  //  for(i <- 1 to 10) {
  //    for (j <- 1 to 4) {
  //      print("o")
  //    }
  //    println()
  //  }
  //  val list : Seq[Int] = 0 to 100
  //  val list2: Seq[Int] = 11 until 13
  //
  //  val numbers = list.flatMap(n => list2.map(c => (n, c)))
  //
  //  println(numbers)
  //
  //
  //  println("NUMBERS 2")
  //
  //  val numbers2 = for {
  //    i <- list
  //    j <- list2
  //  } yield (i, j)
  //
  //  println(numbers2)
  //
  //
  //  val fnnn: Function[Int, Int] = (i: Int) => 2 * i
  //
  //  list2.map(fnnn)
  //  list2.map(c => 2 * c)

  val o1 = new Owner("Eka")
  val o2 = new Owner("Eka2")
  val o3 = new Owner("Eka3")
  val o4 = new Owner("Eka4")


  val shepDog = ShepherdDog("Пушок", 4, Option(o4))

  shepDog.embrace(o1)
  shepDog.embrace(o2)
  shepDog.embrace(o3)
  shepDog.embrace(o4)

  println("Shepard 2")

  val shepDog2 = ShepherdDog("Казявка", 1, None)

  shepDog2.embrace(o1)
  shepDog2.embrace(o2)
  shepDog2.embrace(o3)
  shepDog2.embrace(o4)
}

class Calculator {
  def add(a: Int, b: Int) = a + b
  def mult (a: Int, b: Int) = a * b
  def divide (a: Int, b: Int) = a / b
  def subtr (a: Int, b: Int) = a - b
}

