fun main() {
    val nilai = "E"
    when(nilai){
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again next Year")
        }
    }
    when(nilai) {
        "A","B","C" -> {
            println("Selamat anda lulus")
        }
        else -> {
            println("Anda belum beruntung")
        }
    }

    val nilaiLulus: Array<String> = arrayOf("A","B","C")
    when(nilai) {
        in nilaiLulus -> println("Selamat anda lulus")
        !in nilaiLulus -> println("Anda tidak lulus")
    }
}