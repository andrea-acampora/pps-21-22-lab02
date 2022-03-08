package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.lab02.Es08Optionals.Option
import u02.lab02.Es08Optionals.Option.filter

class Es08OptionalsTest :

  @Test def testFilterOptional(): Unit =
    assertEquals( Option.Some(5), filter[Int](Option.Some(5))(_ > 2) )
