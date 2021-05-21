fun fullName(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Atep","Saprudin","Yanwar")
    fullName(firstName = "Atep",lastName = "Yanwar",middleName = "Saprudin")
}