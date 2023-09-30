import java.lang.NumberFormatException
import kotlin.math.pow

fun main() {
    //print the calculator menu
    println("Calculator Menu:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    println("5. Exponentiation")
    println("6. Modulus")
    println("7. Factorial")
    println("8. Square Root")
    println("9. Nth Root")
    println("Select an operation (1-9)")

    //request a value and choose an outcome based on the input
    when (readln()) {
        "1" -> println("Result: ${add(inputDouble(), inputDouble())}")
        "2" -> println("Result: ${subtract(inputDouble(), inputDouble())}")
        "3" -> println("Result: ${multiply(inputDouble(), inputDouble())}")
        "4" -> println("Result: ${divide(inputDouble(), inputDouble())}")
        "5" -> println("Result: ${power(inputDouble(), inputDouble())}")
        "6" -> println("Result: ${modulus(inputDouble(), inputDouble())}")
        "7" -> println("Result: ${factorial(inputFactorialInt())}")
        "8" -> println("Result: ${nthRoot(inputSquareRootBase())}")
        "9" -> {
            val base = inputDouble()
            println("Result: ${nthRoot(base, inputNthRoot(base))}")
        }
        else -> println("Invalid choice")
    }

}

// add function
fun add(a: Double, b: Double): Double {
    return a + b
}

//subtract function
fun subtract(a: Double, b: Double): Double {
    return a - b
}

//multiply function
fun multiply(a: Double, b: Double): Double {
    return a * b
}

//divide function
fun divide(a: Double, b: Double): Double {
    return a / b
}

//power function
fun power(base: Double, exponent: Double): Double {
    return base.pow(exponent)
}

//modulus function
fun modulus(a: Double, b: Double): Double {
    return a % b
}

//factorial function
fun factorial(num: Int): Int {
    var result = 1
    for (i in 1..num) {
        result *= i
    }
    return result
}

//nthRoot function
fun nthRoot(base: Double, n: Double = 2.0): Double {
        return base.pow(1.0 / n)
}

//function to request the user for a double value
fun inputDouble(): Double {
    //loop until given a valid input
    while (true) {
        //attempt to convert the string to a double and catch an error if unable
        try {
            return readln().toDouble()
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number: ")
        }
    }
}

//function to request the user for a positive integer value
fun inputFactorialInt(): Int {
    //loop until given a valid input
    while (true) {
        //attempt to convert the string to an integer and catch an error if unable
        try {
            val input = readln().toInt()
            if (input >= 1) {
                return input
            } else {
                println("Input out of range. Enter a number greater than 0: ")
            }
        } catch (e: NumberFormatException) {
            println("Input must be an integer. Please enter a valid number: ")
        }
    }
}

//function to request the user for a base for the square root function
fun inputSquareRootBase(): Double {
    //loop until given a valid input
    while (true) {
        //attempt to convert the string to a double and catch an error if unable
        val input = inputDouble()
        if (input < 0) {
            println("Cannot calculate the even root of a negative number")
        } else {
            return input
        }
    }
}

//function to request the user for a value for the nth Root function
fun inputNthRoot(base: Double): Double {
    while (true) {
        val input = inputDouble()
        //make sure the provided value is not 0 or even given a negative base
        if (input == 0.0) {
            println("Cannot calculate 0th root")
        } else if (base < 0 && input % 2.0 == 0.0) {
            println("Cannot calculate the even root of a negative number")
        } else {
            return input
        }
    }
}