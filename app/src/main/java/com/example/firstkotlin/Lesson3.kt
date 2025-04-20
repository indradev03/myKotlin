package com.example.firstkotlin

fun main(args: Array<String>) {
    var age = arrayOf(1,2,3)
    println(age)
    println("This is the first element of age is " + age[0])
    println("The second element of age is" + age[1])
    println("The third element of age is" + age[2])

    println("**************")

    var name = arrayOf(" ram", "shyam","hari")
    name[1]= "saroj"
    println(" The first element of name is "+ name[0])
    println("The second element of name is "+ name[1])
    println("The third element of name is "+ name[2])

    println(name.size)

    // we can add value only after our array is initialize
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)

//    we can add value directly in array while initialize variables
    var age2 = arrayListOf<Int>(1,20,5)
    var name1 = arrayListOf<String>("Saroj", "ram","Shyam")
    name1.add("hari")
    name1.add(4,"Sita")

    name1.remove("Shyam")
    name1.removeAt(0)
    println(name1)

    var mixArraylist= arrayListOf<Any>("hello",5,2.0)
    println(mixArraylist[0]);
    println(mixArraylist[1]);
    println(mixArraylist[2]);

}