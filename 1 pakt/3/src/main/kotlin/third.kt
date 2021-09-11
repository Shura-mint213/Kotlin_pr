//Найдите первый символ в первом максимально длинном слове с чис-
//лом символов,кратным трем, в строке (в строке указываются только
//слова, разделенные одним или несколькими пробелами).

fun main() {
    var firstCharInString = ""
    var charGeneral = ""
    var countCharInString = 0
    var countGeneral = 0
    var flag = 0
    val mainString = readLine()
    if (mainString != "" && mainString!=null) {
        for (charFirst in mainString) {
            if (countGeneral==0)
                charGeneral = charFirst.toString()
            if (charFirst == ' ') { //ищим новое слово кратное 3
                if (countGeneral > 0 && countGeneral%3==0)  {
                    if (countGeneral>countCharInString) {
                        countCharInString = countGeneral
                        firstCharInString = charGeneral
                    }
                }
            countGeneral=0
            flag = -1
            }
            if (flag == -1)
                flag = 0
            else countGeneral++
        }
        when {
            countGeneral == 0 && charGeneral == " " -> println("Одни пробелы(")
            countGeneral%3 == 0 && countCharInString > 0-> {
                if (countGeneral>countCharInString) {
                    firstCharInString = charGeneral
                }
                println("Max char = $firstCharInString")
            }
            charGeneral != " " -> println("Нет слов кратных 3(")
        }
    } else println("Ничего не введено")
}