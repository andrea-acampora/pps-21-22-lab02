package u02

import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test
import u02.lab02.Es04Currying.{funWithCurrying, funWithNoCurrying, valWithCurrying, valWithNoCurrying}

class Es04CurryingTest :

  @Test def testValWithNoCurrying(): Unit =
    assertTrue(valWithNoCurrying(1,2,3))

  @Test def testValWithCurrying(): Unit =
    assertTrue(valWithCurrying(1)(2)(3))

  @Test def testTrueFunWithNoCurrying(): Unit =
    assertTrue(funWithNoCurrying(1, 2, 3))

  @Test def testFalseFunWithNoCurrying(): Unit =
    assertFalse(funWithNoCurrying(3,2,1))

  @Test def testTrueFunWithCurrying(): Unit =
    assertTrue(funWithCurrying(1)(2)(3))

  @Test def testFalseFunWithCurrying(): Unit =
    assertFalse(funWithCurrying(3)(2)(1))
