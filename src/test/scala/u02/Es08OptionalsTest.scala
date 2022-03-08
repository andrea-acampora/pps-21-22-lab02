package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.lab02.Es08Optionals.Option
import u02.lab02.Es08Optionals.Option.{filter, map, map2}

class Es08OptionalsTest :

  @Test def testFilterOptional(): Unit =
    assertEquals(Option.Some(5), filter[Int](Option.Some(5))(_ > 2))

  @Test def testNoneFilterOptional(): Unit =
    assertEquals(Option.None(), filter[Int](Option.Some(5))(_ > 8))

  @Test def testTrueMapOptionals(): Unit =
    assertEquals(Option.Some(true), map(Option.Some(5))( _ > 2))

  @Test def testFalseMapOptionals(): Unit =
    assertEquals(Option.Some(false), map(Option.Some(5))( _ > 8))

  @Test def testNoneMapOptionals(): Unit =
    assertEquals(Option.None(), map(Option.None[Int]())( _ > 2))

  @Test def testMap2Optional(): Unit =
    assertEquals(Option.Some(6), map2[Int](Option.Some(2), Option.Some(4))(_ + _))

  @Test def testWrongMap2Optional(): Unit =
    assertEquals(Option.None(), map2[Int](Option.Some(2), Option.None())(_ + _))
