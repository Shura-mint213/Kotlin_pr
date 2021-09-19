//Найдите первый символ в первом максимально длинном слове с чис-
//лом символов,кратным трем, в строке (в строке указываются только
//слова, разделенные одним или несколькими пробелами).

//В задании No3 первой практической работы реализуйте следующее: вы-
//делите основной алгоритм в отдельную функцию, куда в качестве аргумен-
//та передавайте lambda, имеющую смысл – способ сравнения двух чисел;
//изменяя данную lambda, пользователь вашей функции должен иметь воз-
//можность получить информацию либо о самых длинных, либо о самых ко-
//ротких словах. Аналогичным образом передавайте в вашу функцию lambda,
//которая будет определять условие отбора слов.

fun searchFirstLetter(mainString:String,comparingNumbers:(Int)->Boolean,wordLength:(Int,Int)->Boolean):String{
    var firstCharInString = ' '
    var returnString = ""
    var charGeneral = ' '
    var countCharInString = 0
    var countGeneral = 0
    var flag = 0
    var flagString = true
    for (charFirst in mainString) {
        if (countGeneral==0) {
            charGeneral = charFirst
        }
        if (charFirst == ' ') {           //ищем новое слово кратные заданые в lambda функции
            if((comparingNumbers(countGeneral) && wordLength(countGeneral,countCharInString))
                || (comparingNumbers(countGeneral) && flagString)) {
                countCharInString = countGeneral
                firstCharInString = charGeneral
                flagString = false
            }
            countGeneral=0
            flag = -1
        }
        if (flag == -1)
            flag = 0
        else countGeneral++
    }
    when {                     // проверка если последнее слово небыло проверено
        !comparingNumbers(countGeneral) && firstCharInString != ' '-> returnString = "1.1 Max char = $firstCharInString"
        comparingNumbers(countGeneral) && charGeneral != ' ' -> {
            if (comparingNumbers(countGeneral) && wordLength(countGeneral,countCharInString)) {
                firstCharInString = charGeneral
            }
            returnString = "1.2 Max char = $firstCharInString"
        }
        comparingNumbers(countGeneral) && charGeneral == ' ' -> returnString = "Одни пробелы("
        charGeneral == ' ' || firstCharInString == ' ' -> returnString = "Нет слов кратных 3("
    }
    return returnString
}

fun main() {
    val mainString = readLine()
    if (mainString != "" && mainString!=null) {
        println(searchFirstLetter(mainString, { countGeneral-> (countGeneral > 0 && countGeneral % 3 == 0) },// проверка на кратность
            {countGeneral,countCharInString-> countGeneral > countCharInString })) // проверка на длину
    } else println("Ничего не введено")
}
//if (countGeneral > 0 && countGeneral%3==0)  {
//                if (countGeneral>countCharInString) {
//                    countCharInString = countGeneral
//                    firstCharInString = charGeneral
//                }
//            }