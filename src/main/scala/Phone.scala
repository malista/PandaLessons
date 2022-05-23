package org.yaroshynska

class Phone {

  var number: Int    = _
  protected var model : String = _
  protected var weight: Int    = _

  //1.3 Конструктор, що приймає на вхід 3 параметри - number, model, weight
  def this(number: Int, model: String, weight: Int) = {
    this()
    this.number = number
    this.model = model
    this.weight = weight
  }

  //1.4 Конструктор, що приймає на вхід 2 параметри - number, model
  def this(number: Int, model: String) = {
    this(number, model, weight = 130)
  }

  //1.5 Конструктор без параметрів (не компілюється)
//      def this()={
//       this(5658, "A45", 130)
//      }

  //1.9.1 Має один параметр, виводить в консоль "Телефонує {name}"
  def receiveCall(name: String): Unit = {
    println(s"Телефонує $name")
  }

  //1.9.2 Повертає номер телефону
  def getNumber = number

  //1.10 Додати перевантажений метод, що приймає ім'я і номер
  def receiveCall(name: String, number: Int): Unit = {
    println(s"Телефонує $name номер $number")
  }

  //1.11 Метод з аргументами змінної довжини
  def sendMessage(args: Int*): Unit = {
    args foreach (e =>
      println(e)
      )
  }

  override def toString = s"[number = $number, model = $model, weight = $weight]"
}


//1.2 Екземпляри класу Phone
val item1 = new Phone(525576, "sumsung", 100)
val item2 = new Phone(955639, "A52", 120)
val item3 = new Phone(597565, "M56", 130)

// Створити колекцію з 3 екземплярів цього класу, відсортувати вміст за параметром number
val listOfPhones = List[Phone](new Phone(525576, "sumsung", 100),
                                new Phone(955639, "A52", 120),
                                new Phone(597565, "M56", 130)).sortBy(_.number)

@main
def main() = {
  item1.getNumber
  item3.receiveCall("Nik")
  item2.receiveCall("Alf", 5782124)
  item1.sendMessage(759253545)
  item3.sendMessage(79545665, 80935566)
  println(listOfPhones)
}
