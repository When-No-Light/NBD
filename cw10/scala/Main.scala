object Main {
  def generator: Iterator[(Int, Int)] = for {
    i <- Iterator.from(1)
    j <- 1 until i+1 if i%j == 0
  } yield (i,j)


  def main(args: Array[String]) = {
    var yes = new Yes[String]("somevalue")
    generator take(20) foreach println

    //
    var A:Map[Int,Int] = Map()
    println("\n\nNext\n\n ")
    //
    val buf = generator.buffered
    for (i <- 0 until 20) {
      var buf_var = buf.next()
      // A += (buf_var._1 -> buf_var._2)
      println(buf_var)
      println(buf_var._1)
      println(buf_var._2)
      A = yes.addInt(buf_var._1,buf_var._2, A)
      println(A)

    }
    /////////////////////////////////
    var B: IndexedSeq[Int]  = yes.flatMap1(A)
    println("flatMap")
    println(B)
    println("Map")
    println(yes.Map2(A))

  }
}

