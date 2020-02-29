package com.github.kuzan7.kotlin_course

fun main() {
//  println(sum(2, 3))
//  stringTemplates()
//  ifElse(19).also { println(it) }
//  printProduct("2", "d")
//  forLoop()
//  collectionPlay()
//  println(describe("Hello"))
  objCreatePlay()
}

fun objCreatePlay(){
  var s = Student()
  s.name = "ddd"
  println(s.name)
}

fun describe(obj: Any): String =
  when (obj) {
    1          -> "One"
    "Hello"    -> "Greeting"
    is Long    -> "Long"
    !is String -> "Not a string"
    else       -> "Unknown"
  }

fun collectionPlay(){
  var l = listOf("z", "f")
  println("z" in l)

  l.map { it.toUpperCase() }.filter { it == "Z" }.forEach { println(it) }
}

fun rangePlay(){
  if (2 in 1..3) {
    println("2 in 1..3")
  }

  if(2 !in 3..5){
    println("2 not in 3..5")
  }
}

fun forLoop(){
  var l = listOf("zhangsan", "lisi", "wangwu")
  for(i in l.indices step 2){
    println(i)
  }

  for(i in 1..10 step 2){
    println(i)
  }
}

fun parseInt(str: String) = str.toIntOrNull()

fun printProduct(arg1: String, arg2: String) {
  val x = parseInt(arg1)
  val y = parseInt(arg2)

  // ...
  if (x == null) {
    println("Wrong number format in arg1: '$arg1'")
    return
  }
  if (y == null) {
    println("Wrong number format in arg2: '$arg2'")
    return
  }

// x and y are automatically cast to non-nullable after null check
  println(x * y)}

fun sum(a: Int, b: Int) = a + b

fun test1(){
  val name = "zhangsan"
  var address = "suzhou"
  address = "hangzhou"
}

fun stringTemplates(){
  val name = "zs"
  val age = 18
  println(String.format("%s's age is %d", name, age))
  println("$name's age is $age")
}

fun ifElse(age : Int) = if(age > 18) "old" else "young"


