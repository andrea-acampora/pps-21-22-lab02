package u02.lab02

object Es05Composition :

  def compose(f: Int => Int, g: Int => Int)(x: Int):Int = f(g(x))

  def composeWithGenerics[A,B,C](f: B=>C, g: A=> B): A => C = x => f(g(x))
