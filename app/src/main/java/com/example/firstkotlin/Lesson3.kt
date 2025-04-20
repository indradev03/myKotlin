package com.example.firstkotlin

fun main() {
    var a: String = "Hello World"
    var i: Int = a.length
    var x: Boolean = a.equals("Hello World")
    var username : String = " Softwarica"

    println(username.trim())
    println(a);
    println(i)
    println(a.isEmpty())
    println(a.lowercase())
    println(a.uppercase())
    println(x)
    print(a.plus("How are you?"))
}