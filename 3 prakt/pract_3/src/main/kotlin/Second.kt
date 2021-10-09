//С клавиатуры вводится несколько строк, последняя строка – пустая
//(пустая строка – признак окончания ввода и дальше игнорируется).
//Выведите символы, что отсутствуют ровно в двух строках. Предпола-
//гается, что коды всех символов в строке не превышают 127.
//Короче нужно создавать множества
//Которые будут содержать в себе слова
//Потом эти множества нужно пересечь
// (оставить только те символы которых нет в других словах) и
// если количество оставшихся символов = 2, то вывести их
//В остальных случаях ниче не выводить

fun main(){
    var string = ""
    var newString = ""
    var count = 0
    var err = 0
    var errTwoString = 0
    while (err==0) {
        if (count!=0) {
            string += newString + "\n"
        }
        newString = readLine().toString()
        if (newString == "") {
            err = -1
        }
        else count++
        if (newString == "" && count == 1)
            errTwoString = -1
    }
    if (string!= "" && errTwoString == 0) {

        println("string = ${
            string.split("\n").toList().dropLast(1).
            map{s->s.map{it.toString()}.toSet()}.fold(""){
                    a, b-> ( a.filter {it.toString() != ""}.toSet() intersect b.filter { it != "" }
                .toSet()).toString()
            }.toList()

        } \n full string = ${string.split("\n").toList().dropLast(1).
            map{s->s.map{it.toString()}}.fold(""){
                a, b-> (a+" 5" + b)
            }
        }")

    ///println("string = ${
//            string.split("\n").windowed(2).mapNotNull {
//                it.first().toSet() intersect it.last().toSet()
//            }


    } else println("Ничего не введено(")
}