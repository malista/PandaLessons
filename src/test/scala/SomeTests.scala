package org.yaroshynska

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SomeTests extends AnyFunSuite, Matchers {

  test("Multiplication on 0 is 0") {
    val calculator = new Calculator
    assert(calculator.mult(54, 0) == 0)
    assert(calculator.mult(0, 0) == 0)
    assert(calculator.mult(-54, 0) == 0)
  }

  test("Dividing on 0 should throw an error") {
    val cat = new Cat("Собака")

    assert(cat.getVoice == "Mew")
  }

  test("Fluffy") {
    assert(listOfAn.exists(e => e.getName == "Fluffy"))

    listOfAn should have size 3
  }

  test("the same instance") {
    val cat = new Cat("Fluffy")
    val cat2 = new Cat("Fluffy")

    cat shouldBe cat2

//    cat should be theSameInstanceAs (cat2)
  }
}
