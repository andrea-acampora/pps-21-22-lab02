package u02.lab02

object Es04Currying :

  val valWithCurrying: Int => Int => Int => Boolean = (x:Int) => (y:Int) => (z:Int) => x <= y && y <= z

  val valWithNoCurrying: (Int, Int , Int) => Boolean = (x, y, z ) => x <= y && y <= z

  def funWithNoCurrying(x: Int, y: Int, z: Int): Boolean = x < y && y < z

  def funWithCurrying(x: Int)(y: Int)(z: Int): Boolean = x < y && y < z
