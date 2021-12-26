trait Maybe[A] {

  var newMap: Map[Int, Int] = Map()

  def addInt(a: Int, b: Int, newMap1: Map[Int, Int]): Map[Int, Int] = {
    var newMap: Map[Int, Int] = newMap1

    newMap += (a -> b)
    newMap
  }

  def flatMap1(newMap1: Map[Int, Int]): IndexedSeq[Int] = {
    var newMap: Map[Int, Int] = newMap1

    1 to newMap.size flatMap(newMap.get)

  }

  def square(a:Int):Int
  =
  {
    a*a
  }

  def Map2(newMap1: Map[Int, Int]): IndexedSeq[Int] = {
    var newMap: Map[Int, Int] = newMap1

    var g: IndexedSeq[Int] = 1 to newMap.size flatMap(newMap.get)
    g.map(square)

  }

}


