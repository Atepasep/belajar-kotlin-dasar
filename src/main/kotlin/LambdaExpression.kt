fun toUpper(value: String): String = value.toUpperCase()
fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val itLambda: (String) -> String = {
        "Hello $it"
    }

    val toUpperCase: (String) -> String = ::toUpper

    val result = contohLambda("Atep","Atep")
    val result2 = itLambda("AMIR")
    val result3 = toUpperCase("Atep saprudin Yanwar")
    println(result)
    println(result2)
    println(result3)
}