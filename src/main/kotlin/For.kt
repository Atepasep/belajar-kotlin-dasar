fun main() {
    var array = arrayOf("Atep","Saprudin","Yanwar")
    var total = 0
    for (name in array){
        println(name)
        total++
    }
    println("total perulangan = $total")

    var ukuranArray = array.size-1
    for(i in 0..ukuranArray){
        println("Index ke $i = ${array.get(i)}")
    }
}