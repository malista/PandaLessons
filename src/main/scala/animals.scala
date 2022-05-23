package org.yaroshynska

trait AnimalsTrait {
  val getVoice : String
  val getName : String
  val isWool : Boolean
}

case class Cat(name: String) extends AnimalsTrait{
   val getVoice = "Mew"
   val getName = name
   val isWool = true
}

class Dog (name: String) extends AnimalsTrait{
  val getVoice = "Gaf-Gaf"
  val getName = name
  val isWool = true
}

 //val l: List[AnimalsTrait] = List(Title: Cat, Title: Dog)

val listOfAn = List[AnimalsTrait](new Cat("Fluffy"), new Dog("Murka"), new Cat("Barsik"))


//@main def main() =
//listOfAn.foreach(animal => println(animal.getVoice))

