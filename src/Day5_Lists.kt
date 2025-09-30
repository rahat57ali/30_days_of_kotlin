package org.example

fun main(){

    val emptyList = mutableListOf<Any>()
    println(emptyList.size)

    val fruits = mutableListOf("Banana", "Apple", "Orange","Lemon")
    val vegetables = mutableListOf("Tomato", "Potato", "Cabbage", "Onion")
    val animalProducts = mutableListOf("milk", "meat", "butter", "yoghurt")

    println("Fruits: $fruits")
    println("Vegetables: $vegetables")
    println("Animal Products: $animalProducts")

    // Modifying list
    val firstFruit = fruits[0]
    println(firstFruit)
    val lastIndex = fruits.size - 1
    val lastFruit2 = fruits[lastIndex]

    // Accessing items

    val lastFruit3 = fruits.last()
    val secondLastFruit = fruits[fruits.size-2]
    println(lastFruit3)
    println(secondLastFruit)

    // Slicing
    val allFruits = fruits.subList(0,4)
    val allFruits2 = fruits.subList(0, fruits.size)
    println(allFruits)
    println(allFruits2)

    // Changing items
    fruits[0] = "Avocado"
    println(fruits)

    // Checking items
    val doesExist = "banana" in fruits
    println(doesExist)
    val doesExist2 = "lime" in fruits
    println(doesExist2)

    // Append
    fruits.add("Apple")
    println(fruits)

    //Insert
    fruits.add(2, "Apple")
    println(fruits)

    // Remove
    fruits.remove("Apple")
    println(fruits)

    // Pop & Del
    fruits.removeLast()
    println(fruits)
    fruits.removeAt(3)
    println(fruits)

    // Clear
    val fruits2 = mutableListOf("banana", "orange", "mango", "lemon")
    fruits2.clear()
    println(fruits2)

    // Copy
    val fruits3 = mutableListOf("banana", "orange", "mango", "lemon")
    val fruitsCopy = fruits3.toMutableList()
    println(fruitsCopy)

    // Join
    val positiveNumbers = listOf<Int>(1, 2, 3, 4, 5)
    val zero = listOf(0)
    val negativeNumbers = listOf(-5, -4, -3, -2, -1)
    val integers = negativeNumbers + zero + positiveNumbers
    println(integers)

    // Extend
    val num1 = mutableListOf(0, 1, 2, 3)
    val num2 = mutableListOf(4, 5, 6)
    num1.addAll(num2)
    println("Numbers: $num1")

    // Count
    val fruits5 = listOf("banana", "orange", "mango", "lemon")
    println(fruits5.count { it == "orange"})
    val ages = mutableListOf(22, 19, 24, 25, 26, 24, 25, 24)
    println(ages.count {it == 24})

    // Index
    println(fruits.indexOf("orange"))
    println(ages.indexOf(24))

    // Reverse
    val fruits4 = mutableListOf("banana", "orange", "mango", "lemon")
    fruits4.reverse()
    println(fruits4)

    // Sort
    val fruits8 = mutableListOf("banana", "orange", "mango", "lemon")
    fruits8.sort()
    println(fruits8)
    fruits8.sortDescending()
    println(fruits8)








}