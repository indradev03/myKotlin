package com.example.firstkotlin


//Arithmetic operator
fun main() {

    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1- num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")
}

////Assigned Operator
//fun main() {
//
//    var X:Int = 20
//    var Y:Int = 10
//    var Z:Int = 0
//    Z = X + Y
//    println("z = x + y = $Z")
//    Z += X
//    println("z += x = $Z")
//    Z -= X
//    println("z -= x = $Z")
//    Z *= X
//    println("z *= x = $Z")
//    Z /= X
//    println("z /= x = $Z")
//    Z %= X
//    println("z %= x = $Z")
//}

////UNARY OPERATOR
//
//fun main() {
//
//    var number: Double = 7.6
//    var isCheck: Boolean = true;
//    println("+number = ${+number}"
//    );
//    println("-number = ${-number}"
//    );
//    println("++number = ${++number}"
//    );
//    println("--number = ${--number}" );
//    println("isCheck = ${!isCheck}" );
//
//    println(".    .")
//    var result: Double = 4.7
//    println("result : $result")
//
//    println("result++ :" + result++)
//}

////Equality and relation operator
//fun main() {
//    var a: Int = 5
//    var b: Int = 5
//
//    println("a == b: " + (a == b))
//    println("a != b: " + (a != b))
//    println("a < b: " + (a < b))
//    println("a > b: " + (a > b))
//    println("a >= b: " + (a >= b))
//    println("a <= b: " + (a <= b))
//}

////Conditional operator
//fun main() {
//    var number1: Int = 5
//    var number2: Int = 8
//    var number3: Int = 12
//    var result: Boolean = false
//
//    // Conditional operator (&&) - AND
//    result = (number1 > number2) && (number3 > number2)
//    println(result) // Prints the result of AND operation
//
//    // Conditional operator (||) - OR
//    result = (number1 > number2) || (number3 > number2)
//    println(result) // Prints the result of OR operation
//}

////BODMAS
//
//fun main() {
//    // First expression
//    var result: Int = 5 + 2 * 4
//    println("Result = " + result) // Result of the first calculation
//
//    // Second expression
//    result = (5 + 2) * 4
//    println("Result = " + result) // Result of the second calculation
//
//    // Variables x, y, z, and sum
//    var x: Int = 8
//    var y: Int = 4
//    var z: Int = 2
//    var sum: Int = 0
//
//    // Corrected sum calculation
//    sum = x + --y + --z // Decrement y and z before adding to sum
//    println("x + --y + --z = $sum") // Display the result with string interpolation
//}

