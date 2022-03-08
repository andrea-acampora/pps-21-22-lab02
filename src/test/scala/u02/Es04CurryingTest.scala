package u02

import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test
import u02.lab02.Es04Currying.{funWithCurrying, funWithNoCurrying, valWithCurrying, valWithNoCurrying}

class Es04CurryingTest :

  @Test def testTrueValWithNoCurrying(): Unit =
    assertTrue(valWithNoCurrying(1,2,3))

  @Test def testFalseValWithNoCurrying(): Unit =
    assertFalse(valWithNoCurrying(3,2,1))

  @Test def testTrueValWithCurrying(): Unit =
    assertTrue(valWithCurrying(1)(2)(3))

  @Test def testFalseValWithCurrying(): Unit =
    assertFalse(valWithCurrying(3)(2)(1))

  @Test def testTrueFunWithNoCurrying(): Unit =
    assertTrue(funWithNoCurrying(1, 2, 3))

  @Test def testFalseFunWithNoCurrying(): Unit =
    assertFalse(funWithNoCurrying(3,2,1))

  @Test def testTrueFunWithCurrying(): Unit =
    assertTrue(funWithCurrying(1)(2)(3))

  @Test def testFalseFunWithCurrying(): Unit =
    assertFalse(funWithCurrying(3)(2)(1))
