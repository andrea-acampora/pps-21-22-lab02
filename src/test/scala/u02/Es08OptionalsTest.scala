package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.lab02.Es08Optionals.Option
import u02.lab02.Es08Optionals.Option.{filter, map}

class Es08OptionalsTest :

  @Test def testFilterOptional(): Unit =
    assertEquals( Option.Some(5), filter[Int](Option.Some(5))(_ > 2) )

  @Test def testTrueMapOptionals(): Unit =
    assertEquals(Option.Some(true), map(Option.Some(5))( _ > 2))

  @Test def testFalseMapOptionals(): Unit =
    assertEquals(Option.Some(false), map(Option.Some(5))( _ > 8))

  @Test def testNoneMapOptionals(): Unit =
    assertEquals(Option.None(), map(Option.None[Int]())( _ > 2))