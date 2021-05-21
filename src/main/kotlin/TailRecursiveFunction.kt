fun main() {
    tailrec fun display(value: Int){
        println("Perulangan ke $value")
        if (value > 0){
            display(value - 1)
        }
    }

    fun factorialRecursive(value: Int):Int {
        return when(value){
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    display(10000)
}