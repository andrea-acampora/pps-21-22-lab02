package u02

import org.junit.*
import org.junit.Assert.*
import BTrees.Tree.*

class BinaryTreesTest :
  val tree: BTrees.Tree[Int] = Branch(Branch(Leaf(1), Leaf(2)), Leaf(1))

  @Test def testRightCount(): Unit =
    assertEquals(2, count(tree, 1))

  @Test def testWrongCount(): Unit =
    assertNotEquals(3, count(tree, 1))

  @Test def testRightSize(): Unit =
    assertEquals(3, size(tree))

  @Test def testWrongSize(): Unit =
    assertNotEquals(2, size(tree))

  @Test def testRightFind(): Unit =
    assertTrue(find(tree, 2))

  @Test def testWrongFind(): Unit =
    assertFalse(find(tree, 4))
