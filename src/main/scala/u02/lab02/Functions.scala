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

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def composeWithGenerics[A,B,C](f: B=>C, g: A=> B): A => C = x => f(g(x))
