fun main() {
    loopi@ for (i in 1..10){
        loopj@ for (j in 1..10){
            if (j > 5) {
                break@loopj
            }
            println("$i * $j = ${i * j}")
        }
    }
}