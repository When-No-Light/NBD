object Main {
  def addNewElemToString(str: String): String = {
    str + " + new element"
  }

  def main(args: Array[String]) = {
    val con = new Container[String]("Container param")
    println(con.getContent())
    println(con.applyFunction[String](addNewElemToString))

    val yes = new Yes[String]("Parametere for yes")
    val no = new No

    println(yes.isInstanceOf[Maybe[_]])
    println(no.isInstanceOf[Maybe[_]])

    println(yes.getOrElse("Function getOrElse for 'Yes'"))
    println(no.getOrElse("Function getOrElse for 'No'"))
  }
}