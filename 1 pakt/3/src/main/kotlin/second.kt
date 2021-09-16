import java.security.CodeSource

//С клавиатуры вводится несколько строк, последняя строка – пустая
//(пустая строка – признак окончания ввода и дальше игнорируется).
//Выведите символы, что отсутствуют ровно в двух строках. Предпола-
//гается, что коды всех символов в строке не превышают 127.
fun main(){
    var string = ""
    var newString = ""
    var fullString = ""
    var count = 0
    var resultString = ""
    val zero = 0
    val one = 1
    val two = 2
    var countArrayPrev = zero
    var countArrayNext = one
    var err = 0
    var exit = 0
    var char: Char = ' '
    var countWords = one//= one
    var countPrev = two
    val arr = Array(127) {0}
    while (err==0) {
        if (count!=0) {
            string += newString + "\n"
        }
        newString = readLine().toString()
        if (newString == "" || string == "") {
            err = -1
            println("Ооо нет, это ошибка(")
        }
        else count++
    }
    //err=0
    if (string!="" || err == 0) {
        for(firstChar in string){
            if(firstChar == '\n' ) {
                countWords += one
            }
            if (arr[firstChar.code] == 0  || (arr[firstChar.code] > 0 && countWords > 1))
                arr[firstChar.code] += one

            // arr[fir

        }
        for (i in arr){
            if (i == 1)
                print(exit.toChar())
            exit++
        }
//        val array = Array(count) { "" }
//        count = 0
//        for (char in string) {                     // заносим все строки в массив
//            if (char.toString() != " ") {
//                if (char.toString() == "\n")
//                    count++
//                array[count] += char.toString()
//            }
//        }


    } else println("Ничего не введено(")
//        if(err==0){
//            if (count!=one) {
//                while (exit == 0) {   //поиск одинаковых
//                    for (charFirst in array[countArrayPrev]) {    //символов и конкатинируем в одну строку
//                        for (charSecond in array[countArrayNext])
//                            if (charFirst == charSecond){
//                                fullString +=charSecond
//                            }
//                    }
//                    countArrayPrev++
//                    countArrayNext++
//                    when {
//                        (countArrayNext >= count) -> {
//                            countArrayPrev = countPrev
//                            countArrayNext = zero
//                            countPrev++
//                        }
//                        (countArrayNext == countArrayPrev) -> countArrayNext = countArrayPrev + 1
//                        (countArrayPrev>=count || countArrayPrev >= count)->exit=-1     //нужен выход
//                    }
//                }
//                countArrayNext = 0
//                while (countArrayNext<count) {   //поиск одинаковых для и исключения их конечного ответа
//                    for (charFirst in array[countArrayNext]) {
//                        for (charSecond in fullString) {
//                            if (charFirst == charSecond) err = -1
//                            for (charThrid in resultString)
//                                if (charFirst == charThrid) err = -1
//                        }
//                        if (err==0) resultString += charFirst
//                        else err = 0
//                    }
//                    countArrayNext++
//                }
//                println("fullString = $fullString string = $resultString")
//            } else println("string = $string")
//        } else println("код символа в строке превышает 127")
//    } else println("Ничего не введено(")
}