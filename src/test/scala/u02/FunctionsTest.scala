package u02

import org.junit.Assert.{assertEquals, assertFalse}
import org.junit.Test
import u02.lab02.Functions.parity

class FunctionsTest :

  @Test def parityTest() =
    val evenValue: Int = 2
    val oddValue: Int = 3
    assertEquals(parity(evenValue), "even")
    assertEquals(parity(oddValue), "odd")
    assertEquals(parity(evenValue), "even")
