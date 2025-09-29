import kotlin.math.pow

fun main() {
    // Integers
    println("Addition: ${1 + 2}")
    println("Subtraction: ${2 - 1}")
    println("Multiplication: ${2 * 3}")
    println("Division: ${4.0 / 2}")
    println("Division: ${6.0 / 2}")
    println("Division: ${7.0 / 2}")
    println("Division without the remainder: ${7 / 2}")
    println("Modulus: ${3 % 2}")
    println("Division without the remainder: ${7 / 3}")
    println("Exponential: ${3.0.pow(2)}")

    // Floating numbers
    println("Floating Number, PI $3.14")
    println("Floating Number, gravity $9.81")

    // Complex numbers are not supported in Kotlin natively
    println("Complex number: Not supported directly in Kotlin")
    println("Multiplying complex number: Not supported directly in Kotlin")

    // Declaring the variable at the top first
    val a = 3
    val b = 2

    // Arithmetic operations and assigning the result to a variable
    val total = a + b
    val diff = a - b
    val product = a * b
    val division = a.toDouble() / b
    val remainder = a % b
    val floorDivision = a / b
    val exponential = a.toDouble().pow(b)

    println(total)
    println("a + b = $total")
    println("a - b = $diff")
    println("a * b = $product")
    println("a / b = $division")
    println("a % b = $remainder")
    println("a // b = $floorDivision")
    println("a ** b = $exponential")

    // Declaring values and organizing them together
    val numOne = 3
    val numTwo = 4

    val total2 = numOne + numTwo
    val diff2 = numTwo - numOne
    val product2 = numOne * numTwo
    val div2 = numTwo.toDouble() / numTwo
    val remainder2 = numTwo % numOne

    println("total: $total2")
    println("difference: $diff2")
    println("product: $product2")
    println("division: $div2")
    println("remainder: $remainder2")

    // Calculating area of a circle
    val radius = 10
    val areaOfCircle = 3.14 * radius.toDouble().pow(2)
    println("Area of a circle: $areaOfCircle")

    // Calculating area of a rectangle
    val length = 10
    val width = 20
    val areaOfRectangle = length * width
    println("Area of rectangle: $areaOfRectangle")

    // Calculating a weight of an object
    val mass = 75
    val gravity = 9.81
    val weight = mass * gravity
    println("$weight N")

    println(3 > 2)
    println(3 >= 2)
    println(3 < 2)
    println(2 < 3)
    println(2 <= 3)
    println(3 == 2)
    println(3 != 2)
    println("mango".length == "avocado".length)
    println("mango".length != "avocado".length)
    println("mango".length < "avocado".length)
    println("milk".length != "meat".length)
    println("milk".length == "meat".length)
    println("tomato".length == "potato".length)
    println("python".length > "dragon".length)

    // Boolean comparison
    println("True == True: ${true == true}")
    println("True == False: ${true == false}")
    println("False == False: ${false == false}")
    println("True and True: ${true && true}")
    println("True or False: ${true || false}")

    // Another way comparison
    println("1 == 1 ${1 == 1}")
    println("1 != 2 ${1 != 2}")
    println("A in Rahat ${'A' in "Rahat"}")
    println("B in Rahat ${'B' in "Rahat"}")
    println("coding in coding for all ${"coding" in "coding for all"}")
    println("a in an: ${'a' in "an"}")
    println("4 == 2 ** 2: ${4 == 2.0.pow(2).toInt()}")

    println(3 > 2 && 4 > 3)
    println(3 > 2 && 4 < 3)
    println(3 < 2 && 4 < 3)
    println(3 > 2 || 4 > 3)
    println(3 > 2 || 4 < 3)
    println(3 < 2 || 4 < 3)
    println(!(3 > 2))
    println(!true)
    println(!false)
    println(!!true)
    println(!!false)
}
