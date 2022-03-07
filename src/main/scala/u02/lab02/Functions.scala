package u02.lab02

object Functions :

  def parity(value: Int): String = if ( value % 2 == 0 ) "even" else "odd"

  def parityWithMatchCase(value: Int) =
    value % 2 match
      case 0 => "even"
      case 1 => "odd"

  def negPredicate(predicate: String => Boolean): String => Boolean = !predicate(_)

  def negWithGenerics[A](predicate: A => Boolean): A => Boolean = !predicate(_)

  //Currying
  val valWithCurrying: Int => Int => Int => Boolean = (x:Int) => (y:Int) => (z:Int) => x <= y && y <= z
  val valWithNoCurrying: (Int, Int , Int) => Boolean = (x, y, z ) => x <= y && y <= z
  def funWithNoCurrying(x: Int, y: Int, z: Int): Boolean = x < y && y < z
  def funWithCurrying(x: Int)(y: Int)(z: Int): Boolean = x < y && y < z

  def compose(f: Int => Int, g: Int => Int)(x: Int):Int = f(g(x))

  def composeWithGenerics[A,B,C](f: B=>C, g: A=> B): A => C = x => f(g(x))

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
