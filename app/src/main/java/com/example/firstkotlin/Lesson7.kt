package com.example.firstkotlin

// if else statement
fun main() {
    print("Please enter a number: ")
    val number = readLine()!!.toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("$number is even")
        } else {
            println("$number is odd")
        }
    } else {
        println("Invalid input! Please enter a valid number.")
    }
}

//// IF else if ladder statement
//fun main() {
//    print("Please enter your age: ")
//    val yourAge: Int = readLine()!!.toInt()
//
//    if (yourAge < 13) {
//        println("You are a child")
//    } else if (yourAge < 19) {
//        println("You are a teenager")
//    } else {
//        if (yourAge < 50) {
//            println("You are an adult")
//        } else {
//            println("You are a senior")
//        }
//    }
//}


////Nested if Statement
//
//fun main() {
//    println("Please enter 3 numbers: ")
//
//    // Input numbers
//    val number1: Int = readln()!!.toInt()
//    val number2: Int = readln()!!.toInt()
//    val number3: Int = readln()!!.toInt()
//
//    // Variable to store the largest number
//    var largestNumber: Int
//
//    // Logic to find the largest number
//    if (number1 >= number2 && number1 >= number3) {
//        largestNumber = number1
//    } else if (number2 >= number1 && number2 >= number3) {
//        largestNumber = number2
//    } else {
//        largestNumber = number3
//    }
//
//    // Output the largest number
//    println("The largest number is $largestNumber")
//}


////When Statement
//fun main() {
//    print("Please enter a day number of the week: ")
//    val dayNumber: Int = readln()!!.toInt()
//    var day: String
//
//    // Using the 'when' expression to map the day number to the day of the week
//    when (dayNumber) {
//        1 -> day = "Sunday"
//        2 -> day = "Monday"
//        3 -> day = "Tuesday"
//        4 -> day = "Wednesday"
//        5 -> day = "Thursday"
//        6 -> day = "Friday"
//        7 -> day = "Saturday"
//        else -> day = "Invalid day choice"
//    }
//
//    // Output the day
//    println(day)
//}


////FOR LOOP
//fun main() {
//    // Loop from 1 to 9
//    for (i in 1..9) {
//        // You can add any logic you want here
//    }
//    println(i) // This will print '9' because 'i' will be the last value in the range.
//
//    // Sum of numbers from 0 to 5
//    var sum: Int = 0
//    for (x in 0..5) {
//        println(x) // Prints values from 0 to 5
//        sum += x // sum = sum + x
//    }
//
//    // Sum of even numbers from 0 to 10
//    sum = 0 // Reset sum for the next loop
//    for (x in 0..10) {
//        if (x % 2 == 0) {
//            println(x) // Prints even numbers from 0 to 10
//            sum += x // sum = sum + x
//        }
//    }
//    println("The sum of even numbers is $sum")
//
//    // ArrayList with vehicle names
//    val vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
//
//    // Loop through the arrayList and print each vehicle
//    for (y in vehicle.indices) {
//        println("The value at index $y is: " + vehicle[y])
//    }
//}


////While loop
//fun main() {
//    // First loop: Print numbers from 0 to 4
//    var i: Int = 0
//    while (i < 5) {
//        println(i)
//        i++
//    }
//
//// Second loop: Print factorials from 1! to 5!
//    var k = 1
//    var fact = 1
//    while (k < 6) { // while k <= 5
//        fact *= k   // fact = fact * k
//        println("$k! = $fact")
//        k++
//    }
//}
