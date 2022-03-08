package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.lab02.Es07Shapes.{Shape, area, perimeter}

class Es07ShapesTest :

  @Test def testRectanglePerimeter(): Unit =
    assertEquals(30, perimeter(Shape.Rectangle(10,5)), 0)

  @Test def testRectangleArea(): Unit =
    assertEquals(50, area(Shape.Rectangle(10,5)), 0)

  @Test def testCirclePerimeter(): Unit =
    assertEquals(62.83, perimeter(Shape.Circle(10)), 0.1)

  @Test def testCircleArea(): Unit =
    assertEquals(314.16, area(Shape.Circle(10)), 0.1)

  @Test def testSquarePerimeter(): Unit =
    assertEquals(40, perimeter(Shape.Square(10)), 0)

  @Test def testSquareArea(): Unit =
    assertEquals(100, area(Shape.Square(10)), 0)
