package u02

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import u02.lab02.Es03Functions.{parity, parityWithMatchCase, negPredicate, negWithGenerics}

class Es03FunctionsTest :

  @Test def evenParityTest(): Unit =
    val evenValue: Int = 2
    assertEquals("even", parity(evenValue))

  @Test def oddParityTest(): Unit =
    val oddValue: Int = 3
    assertEquals("odd", parity(oddValue))

  @Test def parityWithMatchCaseTest(): Unit =
    val evenValue: Int = 2
    assertEquals("even", parityWithMatchCase(evenValue))

  @Test def negPredicateTest(): Unit =
    val emptyPredicate: String => Boolean = _ == ""
    val notEmptyPredicate = negPredicate(emptyPredicate)
    assertTrue(notEmptyPredicate("foo") && !notEmptyPredicate(""))

  @Test def negWithGenericsStringTest(): Unit =
    val notEmptyPredicate: String => Boolean = negWithGenerics(_ == "")
    val greaterThanZero: Int => Boolean = _ > 0
    val notGreaterThanZero: Int => Boolean = negWithGenerics(greaterThanZero)
    assertTrue(notEmptyPredicate("foo"))

  @Test def negWithGenericsIntTest(): Unit =
    val notEmptyPredicate: String => Boolean = negWithGenerics(_ == "")
    val greaterThanZero: Int => Boolean = _ > 0
    val notGreaterThanZero: Int => Boolean = negWithGenerics(greaterThanZero)
    assertTrue(notGreaterThanZero(-2))