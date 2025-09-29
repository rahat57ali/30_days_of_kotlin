import kotlin.math.pow

fun main() {
    println(3 + 2)   // addition(+)
    println(3 - 2)   // subtraction(-)
    println(3 * 2)   // multiplication(*)
    println(3 / 2)   // division(/)
    println(3.toDouble().pow(2))  // exponential(**)
    println(3 % 2)   // modulus(%)
    println(3 / 2)   // Floor division operator(//) -> Kotlin division of Int returns Int

    // Checking data types
    println(10::class)                   // Int
    println(3.14::class)                 // Double
    println(1 + 3.toDouble())            // No Complex in Kotlin, handled as Double
    println("Rahat"::class)           // String
    println(listOf(1, 2, 3)::class)      // List
    println(mapOf("name" to "Rahat")::class) // Map
    println(setOf(9.8, 3.14, 2.7)::class)       // Set
    println(listOf(9.8, 3.14, 2.7)::class)      // Tuple equivalent -> List
    println((3 == 3)::class)             // Boolean
    println((3 >= 3)::class)             // Boolean
}


