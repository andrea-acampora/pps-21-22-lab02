package u02

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import u02.lab02.Functions
import u02.lab02.Functions.parity
import u02.lab02.Functions.negPredicate


class FunctionsTest :

  @Test def evenParityTest() =
    val evenValue: Int = 2
    assertEquals(parity(evenValue), "even")


  @Test def oddParityTest() =
    val oddValue: Int = 3
    assertEquals(parity(oddValue), "odd")

  @Test def parityWithMatchCase() =
    val evenValue: Int = 2
    val oddValue: Int = 3
    assertEquals(Functions.parityWithMatchCase(evenValue), "even")
    assertEquals(Functions.parityWithMatchCase(oddValue), "odd")

  @Test def negPredicateTest() =
    val emptyPredicate: String => Boolean = _ == ""
    val notEmptyPredicate = negPredicate(emptyPredicate)
    assertTrue(notEmptyPredicate("foo"))
    assertFalse(notEmptyPredicate(""))
    assertTrue(notEmptyPredicate("foo") && !notEmptyPredicate(""))
