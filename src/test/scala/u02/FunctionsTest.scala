package u02

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import u02.lab02.Functions
import u02.lab02.Functions.{funWithNoCurrying, negPredicate, negWithGenerics, parity}


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

  @Test def negWithGenericsTest() =
    val notEmptyPredicate: String => Boolean = negWithGenerics(_ == "")
    val greaterThanZero: Int => Boolean = _ > 0
    val notGreaterThanZero: Int => Boolean = negWithGenerics(greaterThanZero)
    assertTrue(notEmptyPredicate("foo") && notGreaterThanZero(-2))

  @Test def testFunWithNoCurrying() =
    assertTrue(funWithNoCurrying(1,2,3) && !funWithNoCurrying(3,2,1))
