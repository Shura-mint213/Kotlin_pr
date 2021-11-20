//С клавиатуры вводится несколько строк, последняя строка – пустая
//(пустая строка – признак окончания ввода и дальше игнорируется).
//Выведите символы, что отсутствуют ровно в двух строках. Предполагается,
//что коды всех символов в строке не превышают 127.

fun main() {
    val stringList: List<String> = listOf("www", "weew", "dsfe", "grdd")// readLine()?.split(" ")
    val result = stringList.map {
            it.toList().distinct()
        }.flatten().filter { c ->
            (stringList.map {
                it.toList().distinct()
            }).flatten().count { it == c } == stringList.size - 2
        }.distinct()

    println(result)
}
// www weew dsfe grdd de
//  w  we   dsfe grd  de  слов: 5
//  wwedsfegrdde
//          w e d s f g r
//          2 3 3 1 1 1 1
//            5 -
//            2 2
//   ответ:  e d
