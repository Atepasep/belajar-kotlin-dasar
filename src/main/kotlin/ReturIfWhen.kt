fun main() {
    fun sayHello(name: String = "") : String {
        return if (name == ""){
            "Hello Bro"
        }else{
            "Hello $name"
        }
    }

    fun sayHello2(name: String= "") : String {
        return when(name){
            "" -> "Hello bro When"
            else -> "Hellp $name When"
        }
    }

    println(sayHello())
    println(sayHello("Atep Sap"))
    println(sayHello2())
    println(sayHello2("Atep Sap"))
}