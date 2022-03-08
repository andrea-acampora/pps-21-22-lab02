package u02.lab02

object Es08Optionals extends App :

  enum Option[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(predicate: A => Boolean): Option[A] = opt match
      case Option.None() => Option.None()
      case Option.Some(a) => if (predicate(a)) opt else Option.None()

    def map[A](opt: Option[A])(predicate: A => Boolean): Option[Boolean] = opt match
      case Option.None() => Option.None()
      case Option.Some(a) => Option.Some(predicate(a))

    def map2[A](opt: Option[A], opt2: Option[A])(mapper: (A,A) => A): Option[A] = (opt, opt2) match
      case (Option.Some(a), Option.Some(b)) => Option.Some(mapper(a,b))
      case _ => Option.None()