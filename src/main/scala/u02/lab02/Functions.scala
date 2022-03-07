package u02.lab02

object Functions :

  def parity(value: Int): String = if ( value % 2 == 0 ) "even" else "odd"

  def neg(predicate: String => Boolean): String => Boolean = !predicate(_)
