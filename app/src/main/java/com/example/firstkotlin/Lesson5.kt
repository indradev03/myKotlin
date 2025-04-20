package com.example.firstkotlin

//List
fun main(){
    val numbers:List<String> = listOf("one","two","three","Four")
    println("Number of elements:${numbers.size}")
    println("third element: ${numbers.get(2)}")
    println("fourth element: ${numbers[3]}")
    println("Index pf element \"two\"${numbers.indexOf("two")}")

}


////Mutable and immutable
//
//fun main() {
//    // immutable list
//    val lst = listOf("one","tow","three")
//    println("Mutable list")
//    for (i in lst.indices){
//        println(lst[i])
//    }
//    println()
//    // Mutable List
//    val mutableLst = mutableListOf("one", "two", "three")
//    mutableLst.add("Four")
//    println("Immutable list")
//    for(i in mutableLst.indices){
//        println(mutableLst[i])
//    }
//}

////Set
//fun main(){
//    val numbers = setOf(1, 2, 3, 4)
//    for(element in numbers){
//        println(element)
//    }
//    val numbersBackwards = setOf (4, 3, 2, 1)
//    println("The sets are equal: ${numbers == numbersBackwards}")
//    }

////MAP
//fun map() {
//    val countriesCapitals = mapOf(
//        "Nepal" to "Kathmandu",
//        "China" to "Beijing",
//        "India" to "New Delhi"
//    )
//    println("All keys : ${countriesCapitals.keys}")
//    println("All values: ${countriesCapitals.values}")
//    println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
//}

