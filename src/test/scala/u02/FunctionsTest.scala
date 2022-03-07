package u02

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import u02.lab02.Functions
import u02.lab02.Functions.{compose, fibonacci, funWithCurrying, funWithNoCurrying, negPredicate, negWithGenerics, parity, valWithCurrying, valWithNoCurrying}
import u02.lab02.Es7.{Shape, perimeter, area}

class FunctionsTest :

  @Test def evenParityTest() =
    val evenValue: Int = 2
    assertEquals("even", parity(evenValue))

  @Test def oddParityTest() =
    val oddValue: Int = 3
    assertEquals("odd", parity(oddValue))

  @Test def parityWithMatchCaseTest() =
    val evenValue: Int = 2
    assertEquals("even", Functions.parityWithMatchCase(evenValue))

  @Test def negPredicateTest() =
    val emptyPredicate: String => Boolean = _ == ""
    val notEmptyPredicate = negPredicate(emptyPredicate)
    assertTrue(notEmptyPredicate("foo") && !notEmptyPredicate(""))

  @Test def negWithGenericsStringTest() =
    val notEmptyPredicate: String => Boolean = negWithGenerics(_ == "")
    val greaterThanZero: Int => Boolean = _ > 0
    val notGreaterThanZero: Int => Boolean = negWithGenerics(greaterThanZero)
    assertTrue(notEmptyPredicate("foo"))

  @Test def negWithGenericsIntTest() =
    val notEmptyPredicate: String => Boolean = negWithGenerics(_ == "")
    val greaterThanZero: Int => Boolean = _ > 0
    val notGreaterThanZero: Int => Boolean = negWithGenerics(greaterThanZero)
    assertTrue(notGreaterThanZero(-2))

  @Test def testValWithNoCurrying() =
    assertTrue(valWithNoCurrying(1,2,3))

  @Test def testValWithCurrying() =
    assertTrue(valWithCurrying(1)(2)(3))

  @Test def testTrueFunWithNoCurrying() =
    assertTrue(funWithNoCurrying(1,2,3))

  @Test def testFalseFunWithNoCurrying() =
    assertFalse(funWithNoCurrying(3,2,1))

  @Test def testTrueFunWithCurrying() =
    assertTrue(funWithCurrying(1)(2)(3))

  @Test def testFalseFunWithCurrying() =
    assertFalse(funWithCurrying(3)(2)(1))

  @Test def testCompose() =
    assertEquals(9, compose(_ - 1, _ * 2)(5))

  @Test def testFibonacci() =
    assertEquals(55, fibonacci(10))

  @Test def testFibonacciWithTailRecursion() =
    assertEquals(55, fibonacci(10))

  @Test def testRectanglePerimeter() =
    assertEquals(30, perimeter(Shape.Rectangle(10,5)), 0)

  @Test def testRectangleArea() =
    assertEquals(50, area(Shape.Rectangle(10,5)), 0)

  @Test def testCirclePerimeter() =
    assertEquals(62.83, perimeter(Shape.Circle(10)), 0.1)

  @Test def testCircleArea() =
    assertEquals(314.16, area(Shape.Circle(10)), 0.1)

  @Test def testSquarePerimeter() =
    assertEquals(40, perimeter(Shape.Square(10)), 0)

  @Test def testSquareArea() =
    assertEquals(100, area(Shape.Square(10)), 0)
