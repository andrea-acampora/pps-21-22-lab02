package u02

object BTrees extends App:

  enum Tree[A]:
    case Leaf(value: A)
    case Branch(left: Tree[A], right: Tree[A])

  object Tree:

    def find[A](t: Tree[A], elem: A): Boolean = traverse(t)((l,r) => find(l, elem) || find (r,elem))(_ == elem)

    def size[A](t: Tree[A]): Int = traverse(t)((l,r)=> size(l) + size(r))(_ => 1)

    def count[A](t: Tree[A], elem: A): Int = traverse(t)((l, r) => count(l, elem) + count(r, elem))(x => if (x == elem) 1 else 0)

    def traverse[A,B](t: Tree[A])(branchFunction: (Tree[A], Tree[A]) => B)(leafFunction:  A => B): B = t match
      case Branch(left, right) => branchFunction(left, right)
      case Leaf(value) => leafFunction(value)
