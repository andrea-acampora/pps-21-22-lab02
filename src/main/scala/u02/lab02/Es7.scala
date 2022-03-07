package u02.lab02

object Es7:

  enum Shape:
    case Rectangle(width: Double, length: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  def perimeter(shape: Shape) = shape match
    case Shape.Rectangle(width, length) => 2*(width + length)
    case Shape.Circle(radius) => 2 * Math.PI * radius
    case Shape.Square(side) => 4 * side

  def area(shape: Shape) = shape match
    case Shape.Rectangle(width, length) => width * length
    case Shape.Circle(radius) => radius * radius * Math.PI
    case Shape.Square(side) => side * side
