fun main() {
    var i = 0
    while (true){
        println("Perulangan ke $i")
        i++
        if(i > 1000){
            break
        }
    }

    for (vm in 1..100){
        if (vm % 2 == 0){
            continue
        }
        println("Angka $vm")
    }
}