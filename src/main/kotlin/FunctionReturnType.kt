fun jumlah(a:Int , b:Int): Int {
    val  total = a + b
    return total
}

fun bagi(a:Int, b:Int): Int {
    if(b==0){
        return 0
    }else {
        val hasilbagi = a / b
        return hasilbagi
    }
}
fun main() {
    println(jumlah(2,2))
    println(jumlah(100,100))

    println(bagi(1,2))
}