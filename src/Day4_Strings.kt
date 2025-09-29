fun main() {
    // Single line comment
    val letter = 'P'
    println(letter)
    println(letter.toString().length)

    val greeting = "Hello, World!"
    println(greeting)
    println(greeting.length)

    val sentence = "I hope you are enjoying 30 days of Kotlin challenge"
    println(sentence)

    // Multiline String
    val multilineString = """
        I am a student and enjoy learning.
        I didn't find anything as rewarding as learning new tech stack.
        That is why I'm doing 30 days of Kotlin.
    """.trimIndent()
    println(multilineString)

    // String Concatenation
    val firstName = "Rahat"
    val lastName = "Ali"
    val space = " "
    val fullName = firstName + space + lastName
    println(fullName)
    println(firstName.length)
    println(lastName.length)
    println(firstName.length > lastName.length)
    println(fullName.length)

    // Unpacking characters
    val language = "Python"
    val a = language[0]
    val b = language[1]
    val c = language[2]
    val d = language[3]
    val e = language[4]
    val f = language[5]
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)

    // Accessing characters
    val firstLetter = language[0]
    println(firstLetter)
    val secondLetter = language[1]
    println(secondLetter)
    val lastIndex = language.length - 1
    val lastLetter = language[lastIndex]
    println(lastLetter)

    val lastLetterNeg = language[language.lastIndex]
    println(lastLetterNeg)
    val secondLast = language[language.lastIndex - 1]
    println(secondLast)

    // Slicing
    val firstThree = language.substring(0, 3)
    val lastThree = language.substring(3, 6)
    println(lastThree)
    println(language.takeLast(3))
    println(language.substring(3))

    val pto = language.slice(0..5 step 2)
    println(pto)

    // Escape sequence
    println("I hope every one enjoying the Kotlin challenge.\nDo you ?")
    println("Days\tTopics\tExercises")
    println("Day 1\t3\t5")
    println("Day 2\t3\t5")
    println("Day 3\t3\t5")
    println("Day 4\t3\t5")
    println("This is a back slash  symbol (\\)")
    println("In every programming language it starts with \"Hello, World!\"")

    // String Methods
    val challenge = "thirty days of python"
    println(challenge.replaceFirstChar { it.uppercase() })

    println(challenge.count { it == 'y' })
    println(challenge.substring(7, 14).count { it == 'y' })
    println(Regex("th").findAll(challenge).count())

    println(challenge.endsWith("on"))
    println(challenge.endsWith("tion"))

    val challengeTabs = "thirty\tdays\tof\tpython"
    println(challengeTabs.replace("\t", "        "))
    println(challengeTabs.replace("\t", " ".repeat(10)))

    println(challenge.indexOf('y'))
    println(challenge.indexOf("th"))

    val job = "teacher"
    val country = "Finland"
    val formatted = "I am $firstName $lastName. I am a $job. I live in $country."
    println(formatted)

    val radius = 10
    val pi = 3.14
    val area = pi * radius * radius
    val result = "The area of circle with $radius is $area"
    println(result)

    println(challenge.indexOf('y'))
    println(challenge.indexOf("th"))

    println("ThirtyDaysKotlin".all { it.isLetterOrDigit() })
    println("30DaysKotlin".all { it.isLetterOrDigit() })
    println("thirty days of kotlin".all { it.isLetterOrDigit() })
    println("thirty days of Kotlin 2025".all { it.isLetterOrDigit() })

    println("thirtydaysofkotlin".all { it.isLetter() })
    println("123".all { it.isLetter() })

    println("Thirty".all { it.isDigit() })
    println("30".all { it.isDigit() })

    println("10".all { it.isDigit() })
    println("10.5".all { it.isDigit() })

    println(Regex("^[a-zA-Z_][a-zA-Z0-9_]*$").matches("30DaysOfKotlin"))
    println(Regex("^[a-zA-Z_][a-zA-Z0-9_]*$").matches("thirty_days_of_kotlin"))

}
