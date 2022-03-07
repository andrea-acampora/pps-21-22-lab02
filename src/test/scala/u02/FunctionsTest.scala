package u02

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import u02.lab02.Functions
import u02.lab02.Functions.{compose, fibonacci, funWithCurrying, funWithNoCurrying, negPredicate, negWithGenerics, parity, valWithCurrying, valWithNoCurrying}


class FunctionsTest :

  @Test def evenParityTest() =
    val evenValue: Int = 2
    assertEquals(parity(evenValue), "even")


  @Test def oddParityTest() =
    val oddValue: Int = 3
    assertEquals(parity(oddValue), "odd")

  @Test def parityWithMatchCaseTest() =
    val evenValue: Int = 2
    assertEquals(Functions.parityWithMatchCase(evenValue), "even")

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
    assertEquals(compose(_ - 1, _ * 2)(5), 9)

  @Test def testFibonacci() =
    assertEquals(fibonacci(10), 55)

  @Test def testFibonacciWithTailRecursion() =
    assertEquals(fibonacci(10), 55)
