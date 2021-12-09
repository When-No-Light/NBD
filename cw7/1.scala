// Zadanie 1 a

println("Zadanie 1 a");

val list: List[String] = List(
  "Sunday",
  "Monday",
  "Tuesday",
  "Wednesday",
  "Thursday",
  "Friday",
  "Saturday"
)

// list.foreach(element => println(element))
var elements: String = ""
for (element <- list) {
  if (elements.length != 0) { elements = elements + ", " + element }
  else {
    elements = elements + element
  }

}
println("Days of week, pętla for: " + elements);

// Zadanie 1 b

println("Zadanie 1 b");

var elements2: String = ""
for (element <- list) {
  if (element(0) == 'S') {
    if (elements2.length != 0) { elements2 = elements2 + ", " + element }
    else {
      elements2 = elements2 + element
    }

  }
}
println(
  "Days of week, pętla for wypisująca tylko dni z nazwami zaczynającymi się na „S : " + elements2
);

// Zadanie 1 c

println("Zadanie 1 c");

var elements3: String = ""
var list_l: Int = list.length
var index: Int = -1

while ((list_l - 1) != index) {
  index += 1
  if (elements3.length != 0) { elements3 = elements3 + ", " + list(index) }
  else {
    elements3 = elements3 + list(index)
  }
}

println("Days of week, pętla while : " + elements3);

// Zadanie 2 a

println("Zadanie 2 a");

var elements5: String = ""
var n1: Int = list.length
// var index: Int = -1

var counter: Int = 0

def factorial1(n1: Int, list: List[String], counter: Int): String = {

  if (counter < n1) elements5 += list(counter) + ", ";
  else elements5 += list(counter)

  if (n1 == counter) elements5;
  else factorial1(n1, list, counter + 1)
}

println(
  "Days of week, funkcji rekurencyjna : " + factorial1(list.length - 1, list, 0)
);

// Zadanie 2 b

println("Zadanie 2 b")

var elements4: String = ""
var n: Int = list.length
// var index: Int = -1

def factorial(n: Int, list: List[String]): String = {
  if (n > 0) elements4 += list(n) + ", ";
  else elements4 += list(n)

  if (n <= 0) elements4;
  else factorial(n - 1, list)
}

println(
  "Days of week, funkcja rekurencyjna wypisująca elementy listy od końca : " + factorial(
    list.length - 1,
    list
  )
)

// Zadanie 3

println("Zadanie 3")

def rec_ogon(
    n: Int,
    list: List[String],
    elements333: String = "",
    counter: Int = 0
): String = {
  var el: String = ", "
  if ((n - 1) <= counter) el = "";

  if (n <= counter) { return elements333; }
  else rec_ogon(n, list, elements333 + list(counter) + el, counter + 1)
}

println(
  "Days of week, funkcja rekurencyjna korzystającą z rekurencji ogonowej: " + rec_ogon(
    list.length,
    list
  )
)

// Zadamie 4

println("Zadanie 4 a")

// var initialValue: String = list(0);
// var sum = list.fold(initialValue) {
//   (accumulator, currentElementBeingIterated) =>
//     accumulator + ", " + currentElementBeingIterated
// }
// println("Days of week, funkcja fold: " + sum)

// var foldl1 = list.foldLeft("List => ")(_ +", "+ _)
// println("Days of week, funkcja foldl: " + foldl1)

def testSS(nums: List[String]): String = {
  nums.foldLeft("") { (acc, num) =>
    {

      if (acc.length == 0) {
        acc + num
      } else {

        acc + ", " + num
      }

    }
  }
}

println("Days of week, funkcja foldLeft: " + testSS(list))

println("Zadanie 4 b")

// var foldr1 = list.foldRight("=> List")(_ +", "+ _)
// println("Days of week, funkcja foldl: " + foldr1)
def testSS2(nums: List[String]): String = {
  nums.foldRight("") { (acc, num) =>
    {

      if (acc.length == 0) {

        acc + num
      } else if (num == "") {
        acc + num
      } else {

        acc + ", " + num
      }

    }
  }
}

println("Days of week, funkcja foldRight: " + testSS2(list))

println("Zadanie 4 c")

// def testSS(nums:List[String]):String = {
//   nums.fold("") { (acc, num) => {
//     if (num(0) == 'S'){
//       if(acc.length==0){
//         acc + num }
//       else{

//       acc+", " + num }
//     }
//     else {
//       acc
//     }
//   }
//   }
// }

// println(testSS(list))

def testSS1(nums: List[String]): String = {
  nums.foldLeft("") { (acc, num) =>
    {
      if (num(0) == 'S') {
        if (acc.length == 0) {
          acc + num
        } else {

          acc + ", " + num
        }
      } else {
        acc
      }
    }
  }
}

println(testSS1(list))


// Zadanie 5

println("Zadanie 5")

var products = scala.collection.mutable.Map("Apple" -> 5.50, "Banan" -> 3.25,"Pie" -> 20.0)

products.keys.foreach{ i =>  
   print( "Key = " + i )
   println(" Value = " + products(i) )}


def ff1(num: Double ): Double = {
  println(num)
  num*0.9
}

// val products_clone = collection.mutable.Map[String,Double]() ++= products
val products_clone = products.clone()


// products_clone.keys.foreach{ i =>  
   
//   products_clone(i)= products_clone(i)*0.9}



// products_clone.keys.foreach{ i =>  
//    print( "Key = " + i )
//    println(" Value = " + products_clone(i) )}

var a = products_clone.view.mapValues(ff1).toMap 
a.keys.foreach{ i =>  
   print( "Key = " + i )
   println(" Value = " + a(i) )}


// z  mechanizmem mapowania

var products_clone2 = products.clone()

var products_clone3 = products_clone2.values map (_ * 0.9)


val couples = products.keys zip products_clone3
println(couples)
val couplesMap = couples.toMap
println(couplesMap)


// Zadanie 6

println("Zadanie 6")

def read_typel(t:(String,Int,Double)): Unit  = {
  println(t._1)
  println(t._2)
  println(t._3)
 
 
}
val ingredient = new Tuple3 ("Sugar" , 25, 0.25)
read_typel(ingredient)

// Zadanie 7

println("Zadanie 7")

val opt : Option[Int] = Some(103);
println(products.get("5").getOrElse("No key found"));
println(opt.isEmpty);


// Zadanie 8

println("Zadanie 8")

import scala.collection.mutable.ListBuffer

var integer_list = List(1,2,0,8,0,7,0,44,0,0,44);




//var list_il: Int = integer_list.length
//var counter_l: Int = 0

def delete_zeros(n: Int, list: ListBuffer[Int]): ListBuffer[Int] = {
    
    if(list(n)==0)list.remove(n)
    if (n == 0) list;
    else delete_zeros(n-1, list)
  }

def delete_zeros1(n: Int, list: List[Int]): ListBuffer[Int] = {
  var new_list = ListBuffer.empty[Int]
  new_list ++= list 
  delete_zeros(n, new_list)

}
println(
  "List without zeros : " + delete_zeros1(integer_list.length - 1, integer_list)
);



// Zadanie 9

println("Zadanie 9")

def add_to_int(list: List[Int]): List[Int] ={
  list map (_ + 1)
}

println(add_to_int(integer_list))


// Zadanie 10

println("Zadanie 10")


var integer_list2 = List(1,2,0,-3,0,-4,0,44,0,0,44);


def add_to_int1(list: List[Int]): List[Int] ={
  var list1: List[Int]= list
  list1 = list.filter(_ > -5)
  list1 = list1.filter(_ < 12)
  list1 map (_ .abs)
}

println(add_to_int1(integer_list2))


