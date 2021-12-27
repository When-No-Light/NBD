trait Pracownik extends Osoba {
  override val podatek: Int = 20
  private var _pensja: Double = 0
  def pensja = _pensja
  def pensja_(value:Double )=_pensja = value

}