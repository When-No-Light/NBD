class Yes[A](var value: A) extends Maybe[A]  {
  def applyFunction[R] (function: A => R) = function(value)
  def getOrElse(param: A) = value
}