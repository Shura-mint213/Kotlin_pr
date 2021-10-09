//Найдите первый символ в первом максимально длинном слове с чис-
//лом символов,кратным трем, в строке (в строке указываются только
//слова, разделенные одним или несколькими пробелами).
fun main() {
    val mainString = readLine()
    if (mainString != "" && mainString!=null) {
        println("max = ${mainString.split(" ").filter { 
            it.length%3 == 0
        }.maxByOrNull { it.length }.toString().firstOrNull()
        }")
    } else println("Ничего не введено")
}