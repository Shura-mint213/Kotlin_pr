//Побитовую стрелку Пирса второй цифры всех чисел (операции вы-
//полняются справа налево)

fun main(){
    val stringFull = "21 42 513"
    val string = stringFull.split(" ")
    val result = string.filter { it.length > 1 }?.map { it[1].code - '0'.code }?.
        filter { it in 1..9 }?.
        reversed()?.reduce{a, b -> (a or b).inv() }?: " null"

    println("string = $string")
    println("result = $result")
}