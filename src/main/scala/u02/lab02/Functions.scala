package u02.lab02

object Functions :

  def parity(value: Int): String = if ( value % 2 == 0 ) "even" else "odd"

  def parityWithMatchCase(value: Int) =
    value % 2 match
      case 0 => "even"
      case 1 => "odd"

  def negPredicate(predicate: String => Boolean): String => Boolean = !predicate(_)

  def negWithGenerics[A](predicate: A => Boolean): A => Boolean = !predicate(_)
