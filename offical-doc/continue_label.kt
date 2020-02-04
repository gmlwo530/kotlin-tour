fun main() {
  println("Without Label Start")
  for (i in 1..3){
    for (j in 1..5){
      if (j==4) continue
      print("$j ")
    }
  }
  println("\nWithout Label Done")
  println("--------------")

  println("With Label Start")
  loop@ for (i in 1..3){
    for (j in 1..5){
      if (j==4) continue@loop
      print("$j ")
    }
  }
  println("\nWith Label Done")
}
