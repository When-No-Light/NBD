object Main {

  def main(args: Array[String]): Unit = {

    // ZADANIE 1

    println("Zadanie 1\n\n")

    def function_1(str: String): String = {
      val workingDays = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek")
      val weekendDays = List("Sobota", "Niedziela")

      str match {
        case first if (workingDays.contains(first)) => "Praca"
        case second if (weekendDays.contains(second)) => "Weekend"
        case _ => "Nie ma takiego dnia"
      }
    }
    println(function_1("wyraz"))
    println(function_1("Środa"))
    println(function_1("Wtorek"))
    println(function_1("Sobota"))

    // ZADANIE 2

    println("\n\nZadanie 2\n\n")

    val firstMoney = new KontoBankowe(100)

    println("Stan pierwszego konta: " + firstMoney.stanKonta)
    println(firstMoney.wplata(10))
    println(firstMoney.wyplata(20))

    val secondMoney = new KontoBankowe()

    println("Stan drugiego konta: " + secondMoney.stanKonta)
    println(secondMoney.wplata(22))
    println(secondMoney.wyplata(13))

    // ZADANIE 3

    println("\n\nZadanie 3\n\n")

    def greetings(person: Osoba) = {
      val greeting = person match {
        case Osoba("Obi-Wan", "Kenobi") => "May the force be with you!"
        case Osoba("Darth", "Vader") => "Bow before the power of the Dark Side!"
        case _ => "Hello!!!"
      }

      println(greeting)
    }


    val person1 = Osoba("Obi-Wan", "Kenobi")
    val person2 = Osoba("Darth", "Vader")
    val person3 = Osoba("Stormtrooper", "None")

    greetings(person1)
    greetings(person2)
    greetings(person3)

    // ZADANIE 4

    println("\n\nZadanie 4\n\n")

    def square(num: Int): Int = num*num

    def funcToUseFunc(num: Int, fun: (Int) => Int): Int = {
      fun(fun(fun(num)))
    }

    val num = 42

    println(funcToUseFunc(num, square))

    // ZADANIE 5

    println("\n\nZadanie 5\n\n")


    val osobaStudent = new Osoba("Herry", "Potter") with Student

    println(s"Studenci płacą: ${osobaStudent.podatek}%")

    val osobaPracownik = new Osoba("Professor ", "Snape") with Pracownik

    println(s"Pracownicy płacą ${osobaPracownik.podatek}%")


    val osobaNauczyciel = new Osoba("Pani", "od Angielskiego") with Nauczyciel

    println(s"Nauczyciel płaci ${osobaNauczyciel.podatek}%")

    val osobaS = new Osoba("Student", "Pracownik") with Pracownik with Student
    println(s"Podatek studenta, który pracuje wynosi ${osobaS.podatek}%")

    val osobaP = new Osoba("Pracownik", "Student") with Student with Pracownik
    println(s"Podatek pracownika, który studiuje wynosi ${osobaP.podatek}%")
  }
}

