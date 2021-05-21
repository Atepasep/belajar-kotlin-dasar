fun hitungTotal(nama: String, vararg values:Int): Int {
    var total = 0
    for (value in values){
        total += value
    }
    return total
}
fun main() {
    var result = hitungTotal("Atep",10,10,10,10,500)
    println(result)
}