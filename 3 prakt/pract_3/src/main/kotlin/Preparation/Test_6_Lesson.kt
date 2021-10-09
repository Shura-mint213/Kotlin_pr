package Preparation

fun main() {
//    val l = listOf("Сидоров" to Pair('М',180), "Иванова" to Pair('F',169),
//            "Ураров" to Pair('М',168), "Купринов" to Pair('М',170))
//    // строются по росту, найти сколько пар мальчик, девочка стоят рядом
//    println("windowed = ${l.sortedByDescending { it.second.second }.windowed(2).filter {
//        it.first().second.first != it.last().second.first
//    }.count()}")//windowed группирует по парам
//    println("windowed = ${l.sortedByDescending { it.second.second }.windowed(2)}")
//////--------------отсортировать в случайном порядке
//    val l = listOf("Иванова","Куров","Лапов","Функин",
//        "Филов","Абрамов","Ян","Рук")
//    val l2 = (1..25).shuffled()
//
//    println("randon = ${l2.zip(l)}")
//    println("min по алфовиту = ${l.minOrNull()}, max = ${l.maxOrNull()}")
//    println("average средняя длина = ${l.map { it.length }.average()} " +
//            "sum длин = ${l.map{it.length}.sum()}")
//    // альтернатива / подстваить by все, кроме average
//    println("maxBy максимальный по длине = ${l.maxByOrNull { it.length }}")
//    println(" ${l.maxWithOrNull(compareBy{it.toUpperCase().reversed()})}") // последняя самая максимальная буква
///-------------fold и reduce
//    val l = listOf(2,5,3,4,3)
//    println(" ${l.reduce{a ,b-> a*b}}")
//    println(" ${l.fold(1){a ,b-> a*b}}")
//    println(" ${l.fold(""){a ,b-> a+b.toString()}}")
//    println(" ${l.foldRight(""){b ,a-> a+b.toString()}}")
//
//    val n = 1256
//    println("n = ${n.toString().map { it.toInt() - '0'.toInt() }.fold(0){a,b->a*10+b}}")
//    println("n reverse = ${n.toString().map { it.toInt() - '0'.toInt() }.foldRight(0){b,a->a*10+b}}")
///////-------------------------
    val n = setOf(1, 4, 6, 9)
    val n2 = setOf(2, 5, 8, 9)
    val l = setOf('1', '5', '2', "7", '8')
    val l2 = setOf('3', '6', '2', '7', "8")
    val l3 = listOf('3', '6', '2', '7', "8")
    val l4 = listOf(' ')
    println("n + n2 = ${n + n2}")
    println("n union n2 = ${n union n2}")
    println("n intersect n2 = ${n intersect n2}")
    println("n subtract n2 = ${n subtract n2}")
    println("n - n2 = ${n - n2}")
    println("l intersect l2 = ${l intersect l2}")
    println("l intersect l3 = ${l intersect l3}")
    println("l intersect l4 = ${l intersect l4}")
    println("l intersect l3.toSet() = ${l intersect l3.toSet()}")
    println("l intersect l3.drop(5) = ${l intersect l3.drop(5).filter { it.toString() != " " }}")
}
//--------------------
//    val l = listOf(214,256,3172)
//    println("${l.map{
//        generateSequence(it) {it/10}.takeWhile{it!=0}.map{it%10}.toSet()
//    }.reduce{a,b-> a intersect b}
//    }")

//}
