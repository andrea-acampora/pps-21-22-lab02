package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.lab02.Es05Composition.{compose, composeWithGenerics}

class Es05CompositionTest :

  @Test def testCompose(): Unit =
    assertEquals(9, compose(_ - 1, _ * 2)(5))

  @Test def testComposeWithGenerics(): Unit =
    assertEquals(9, composeWithGenerics[Double, Double, Double](_ - 1, _ * 2)(5), 0)
