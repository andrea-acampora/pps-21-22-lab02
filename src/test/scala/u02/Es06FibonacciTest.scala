package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.lab02.Es06Fibonacci.fibonacci

class Es06FibonacciTest :

  @Test def testFibonacci(): Unit =
    assertEquals(55, fibonacci(10))

  @Test def testFibonacciWithTailRecursion(): Unit =
    assertEquals(55, fibonacci(10))
