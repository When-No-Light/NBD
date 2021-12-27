class KontoBankowe(poczatkowyStan: Double) {
  private var _stanKonta: Double = poczatkowyStan

  def stanKonta: Double = _stanKonta

  def this() {
    this(0)
  }

  def wplata(kwota: Double): Double = {
    _stanKonta = _stanKonta + kwota
    _stanKonta
  }

  def wyplata(kwota: Double): String = {
    if (_stanKonta - kwota < 0) return "Za malo srodkow na koncie"

    _stanKonta = _stanKonta - kwota
    _stanKonta.toString
  }
}
