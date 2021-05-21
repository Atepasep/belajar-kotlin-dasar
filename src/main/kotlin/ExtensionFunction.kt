fun String.hello() : String {
    return "Hello $this"
}
fun String.printHello() : Unit = println("Hello $this cek")
fun main() {
    val  name = "Atep"
    println(name.hello())
    name.printHello()
}