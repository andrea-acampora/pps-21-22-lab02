package u02.lab02

object Es06Fibonacci :

  def fibonacci(x: Int): Int = x match
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(x - 1) + fibonacci(x - 2)

  def fibonacciWithTailRecursion(x: Int): Int =
    @annotation.tailrec
    def _fib(x: Int, a: Int , b: Int): Int = x match
      case 0 => a
      case 1 => b
      case _ => _fib(x-1, b, a+b)
    _fib(x, 0, 1)
