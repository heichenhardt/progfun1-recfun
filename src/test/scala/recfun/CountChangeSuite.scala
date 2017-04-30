package recfun

import org.scalatest.FunSuite


import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange

  test("countChange: For amount of Zero") {
    assert(countChange(0,List(1,2)) === 1)
  }

  test("countChange: For amount, having no coins") {
    assert(countChange(1,List()) === 0)
  }

  test("countChange: For amount, having one coin") {
    assert(countChange(1,List(1)) === 1)
  }

  test("countChange: For amount, having two coin") {
    assert(countChange(1,List(2,1)) === 1)
  }

  test("countChange: For amount, having two coin with 2 ways") {
    assert(countChange(2,List(1,2)) === 2)
  }

  test("countChange: example given in instructions") {
    assert(countChange(4,List(1,2)) === 3)
  }

  test("countChange: sorted CHF") {
    assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  test("countChange: no pennies") {
    assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("countChange: unsorted CHF") {
    assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }

}
