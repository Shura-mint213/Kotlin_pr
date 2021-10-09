fun main(){
    val s1 = "61236231"
    val s2 = s1.toSet()
    var max : Char = ' '
//    val s3 = s1.groupBy {it}.map{Pair(it.key, it.value.count())}.filter{it.second==2}
//    val test = s1.groupBy {it}.map{Pair(it.key, it.value.count())}.filter{it.second/4==0}
//    val list = s1.reversed().toList().mapIndexed{index, value -> if(index/4==0) "$value"}//
//    //mapIndexed{index, value -> if(index/4==0)}
//    val test1 = s1.reversed().map{it.toInt()-'0'.toInt()}.toList().groupBy{it}.map{Pair(it.key,it.value+1)}
//    val test3 = s1.reversed().map{it.toInt()-'0'.toInt()}.filter {it != 1 }.toList().groupBy{it}.map{Pair(it.key,it.value+1)}.
//        unzip()*/
    //zip ИЗ списка в пару
    //unzip
    //.map{it.toInt()-'0'.toInt()} преобразования в число
    // filter если true оставить, если false не включать
//    println("test3 unzip = $test3 ")
//    val l1 = listOf("иванов","смирнов","соболев")
//    println("l1.associateBy = ${l1.associateBy { it.length }}")// associateWith наоборот
//    println("l1.associateBy()${l1.associateBy ( keySelector = { it.toUpperCase() }, valueTransform = {it.length})}")
//    val l3 = listOf("124","457","67531")
//    val test6 = l3.map {e-> e.map{it.toInt() - '0'.toInt()} }
//    println("l3.map {${test6}}")
//    println("test6.flatten() = ${test6.flatten()}")//уберает уровень 1
//    val lc1 = l3.flatMap {e-> e.map{it.toInt() - '0'.toInt()}}
//    println("{l3.flatMap {} = $lc1")
//    val o5 = generateSequence(1) {it+1}.takeWhile {it<95}.sum() // по условию
//    println(o5)
//    val result = s1.reversed().map{it.toInt()-'0'.toInt()}.filterIndexed{index, _ -> (index+1)%4 == 0}
//    // получаем элемент кратный 4
//    println("result = $result ")
//-----------------------5 пара
    val l = listOf("Иванов Иван Иванович","Петров Перт Петрович","Сидоров Сидор")
    val l2 = l.map{
        it.split(" ").mapIndexedNotNull{index, value-> //mapIndexedNotNull оставляет те значения
            if (index==0) value// которые не NULL
            else value.firstOrNull()?.toString()?.plus(" .") //возвращает первый символ если он есть
        }.joinToString(separator = " ") // а если его нет, то NULL// ?.toString() преобразует если есть символ
    }  // а иначе остается null//?.plus(" .") к строке добавляет " ." если она есть, else NULL
    println(l2)
    val l3 = ('A'..'z').joinToString(separator = "")
    println(l3)

//    val l4 = listOf("Иванов" to 3, "Куров" to 3, "Лапов" to 2, "Функин" to 5)
//    val (losers, usuals) = l4.partition {it.second == 2}//partition - выделяет из списка, масива,
//                  // то что соответствует условию и то что нет
//    println("Двоичники: ${losers.joinToString(separator = " \n")}")
//    println("Успешные студенты: ${usuals.map{it.first}.joinToString(separator = "\n")}")
/////-----------------------------
///    val n = 10
//    val nPr = ((2..(n-1)).filter { n%it==0}.isEmpty())//isEmpty-список пустой//true если простой и false составное
//    println("nPr = $nPr")
//    val nPr2 = ((2..(n - 1)).none { n % it == 0 })//none-проверка, что неи элементов соответствующих условию
//                                           // true если простой и false составное
//    println("nPr2 = $nPr2")
//    val l4 = listOf("Иванов" to 3, "Куров" to 3, "Лапов" to 2, "Функин" to 5)
//    println("l4.all = ${l4.all{it.second<2}}")// все элементы удовлетворяют условию
//    println("l4.all = ${l4.any{it.second==2}}")// есть хотяюы 1 элемент удовлетворяющий условию
//---------------------
//    val l1 = listOf("214", "341", "53", "3513")
//    val l1Pr = l1.map{it.map { it.toInt() - '0'.toInt() }}.map{
//        it.toSet()
//    }
//    println("l1Pr = $l1Pr")
//    var s: Set<Int> = setOf()
//    for (s2For in l1Pr) s = s2For + s
//    println("s = $s")
//
//    val l2Pr = l1Pr.drop(1)
//    var s3: Set<Int> = l2Pr.first()
//    for (s3For in l1Pr) s3 = s3 - s3For
//    println("s3 = $s3")
//----------------GroupBy
//    val l4 = listOf("Иванов" to 3, "Куров" to 2, "Лапов" to 4, "Функин" to 5,
//    "Филов" to 5, "Абрамов" to 3)
//
//    val l4Pr = l4.groupBy { it.second }// groupBy - группирует по чему-то (по значению сечас)
//    println("l4Pr = $l4Pr")
//    val l5Pr = l4Pr.mapValues {(k,v)-> v.count() }
//    println("l4Pr = $l4Pr")
//    val l6Pr = l4Pr.mapValues { (k,v) -> v.map {it.first} }.toList().map{
//        it.first.toString() + ": " + it.second.joinToString()
//    }.joinToString(separator = "\n")
//    println("l6Pr = $l6Pr")
//
//    val l7Pr = l4.groupBy(keySelector = {it.second},valueTransform = {it.first})//keySelector - по чему будет групироваться
//             // valueTransform - как преобразовать значения
//    println("l7Pr = $l7Pr")
//
//    val l8Pr = l4.groupingBy {it.second}.eachCount()
//    println("l8Pr = $l8Pr")
//
///----------------------
//    val l4 = listOf("Иванова","Куров","Лапов","Функин",
//    "Филов","Абрамов","Ян","Рук")
//    val l4Pr = l4.groupBy {it}.map { Pair(it.key.count(),it.value) }.
//        sortedBy { -it.first }.take(7).filterNot { it.first==5 }.dropLast(2)
//    println(l4Pr)
//
//    println("sorted = ${l4.sorted()}")// сортировка
//-------------takeWhile- цикл
//    val n = readLine()!!.toInt()
//    val allNumbers = generateSequence(1) { it+1 }
//    println("takeWhile = ${allNumbers.takeWhile {it*it<n}.toList().lastOrNull()}")// берем генерируем чила в
//         // цикле, и отбераем последней число из сгенерированых
//    println("dropWhile = ${allNumbers.dropWhile{it*it<n}.firstOrNull()}")//большее или равное данного
//            // удалить все числа удовлетворяющие условию
//--------------------chunked
    val l4 = listOf("Иванова","Куров","Лапов","Функин",
    "Филов","Абрамов","Ян","Рук")
     println("chunked = ${l4.chunked(3)}") //разбивает на группы на столько на сколько указано
     println("chunked.map.mapIndexed = ${l4.chunked(3).map{
         it.mapIndexed{index, value-> "${index+1}. $value"}
     }.flatten()}")
}
