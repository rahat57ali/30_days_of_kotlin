
fun main() {
    var firstName = "Rahat"
    var lastName = "Ali"
    var country = "Pakistan"
    var city = "Islamabad"
    var age = 25
    var isMarried = true
    var skills = listOf("Java", "C++", "JS", "Grails", "Python")
    var personInfo = mapOf(
        "firstname" to "Rahat",
        "lastname" to "Ali",
        "country" to "Pakistan",
        "city" to "Islamabad"
    )

    // Printing the values stored in the variables
    println("First name: $firstName")
    println("First name length: ${firstName.length}")
    println("Last name: $lastName")
    println("Last name length: ${lastName.length}")
    println("Country: $country")
    println("City: $city")
    println("Age: $age")
    println("Married: $isMarried")
    println("Skills: $skills")
    println("Person information: $personInfo")

    // Declaring multiple variables in one line
    var (fName, lName, cnt, ag, married) = listOf("Rahat", "Ali", "Islamabad", 250, true)

    println("$fName $lName $cnt $ag $married")
    println("First name: $fName")
    println("Last name: $lName")
    println("Country: $cnt")
    println("Age: $ag")
    println("Married: $married")
}
