package com.example.firstkotlin

fun show(a: Int, b: Int): Unit {
    println("You entered $a and $b")
}

fun add(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}

fun findMinimumNumber(a: Int, b: Int): Int {
    return if (a > b) b else a
}

fun main() {
    println("Enter first number: ")
    val a: Int = readln()!!.toInt()

    println("Enter second number: ")
    val b: Int = readln()!!.toInt()

    show(a, b)

    val sum = add(a, b)
    println("Sum of the two entered numbers is $sum")

    val minimum = findMinimumNumber(a, b)
    println("And the smallest between $a and $b is $minimum")
}
