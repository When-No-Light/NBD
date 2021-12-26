class Container[A](private val value: A)  {
  def getContent() : A = {
    value
  }

  def applyFunction[R](function: A => R): R = {
    function(getContent())
  }
}
