package u02

object BTrees extends App:

  // A custom and generic binary tree of elements of type A
  enum Tree[A]:
    case Leaf(value: A)
    case Branch(left: Tree[A], right: Tree[A])

  object Tree:
    def size[A](t: Tree[A]): Int = t match
      case Branch(l, r) => size(l) + size(r)
      case _ => 1

    def find[A](t: Tree[A], elem: A): Boolean = t match
      case Branch(l, r) => find(l, elem) || find(r, elem)
      case Leaf(e) => e == elem

    def count[A](t: Tree[A], elem: A): Int = t match
      case Branch(l, r) => count(l, elem) + count(r, elem)
      case Leaf(e) if e == elem => 1
      case _ => 0
