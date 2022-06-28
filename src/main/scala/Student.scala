package org.yaroshynska

trait Scholarship{
  def getScholarship(): Int
  val firstName: String
  val lastName: String
  val group: String
  val averageMark: Double
}

class Student(val firstName: String, val lastName: String, val group: String, val averageMark: Double) extends Scholarship {
  def getScholarship(): Int = {
    if (averageMark == 5) 100 else 80
  }
}

class Aspirant(firstName: String, lastName: String, group: String, averageMark: Double, val research: List[String])
  extends Student(firstName, lastName, group, averageMark) {
  override def getScholarship(): Int = {
    if (averageMark == 5) 200 else 180
  }
}

val student: Scholarship = new Aspirant("Peter", "Parker", "CS", 5, Nil)

val listOfStudents: Seq[Scholarship] = List(new Student("Hermione", "Granger", "HG", 5),
  new Student("Ron", "Weasley", "HG", 4),
  new Student("Harry", "Potter", "HG", 4),
  new Aspirant("Tony", "Stark", "CS", 5, List("SomeWork")),
  new Aspirant("Peter", "Parker", "CS", 5, Nil))

@main def main() ={
  listOfStudents.foreach(student => println(student.getScholarship()))
}
