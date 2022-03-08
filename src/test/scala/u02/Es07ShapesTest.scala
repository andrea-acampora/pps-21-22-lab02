package u02

import org.junit.Assert.assertEquals
import org.junit.Test
import u02.lab02.Es07Shapes.Shape.{area, perimeter}
import u02.lab02.Es07Shapes.Shape

class Es07ShapesTest :

  val exampleLength: Double = 10

  @Test def testRectanglePerimeter(): Unit =
    assertEquals(30, perimeter(Shape.Rectangle(exampleLength, exampleLength / 2)), 0)

  @Test def testRectangleArea(): Unit =
    assertEquals(50, area(Shape.Rectangle(exampleLength, exampleLength / 2)), 0)

  @Test def testCirclePerimeter(): Unit =
    assertEquals(2 * Math.PI * exampleLength, perimeter(Shape.Circle(exampleLength)), 0.1)

  @Test def testCircleArea(): Unit =
    assertEquals(exampleLength * exampleLength * Math.PI, area(Shape.Circle(exampleLength)), 0.1)

  @Test def testSquarePerimeter(): Unit =
    assertEquals(exampleLength * 4, perimeter(Shape.Square(exampleLength)), 0)

  @Test def testSquareArea(): Unit =
    assertEquals(exampleLength * exampleLength, area(Shape.Square(exampleLength)), 0)
