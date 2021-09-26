//С клавиатуры вводится несколько строк, последняя строка – пустая
//(пустая строка – признак окончания ввода и дальше игнорируется).
//Выведите символы, что отсутствуют ровно в двух строках. Предпола-
//гается, что коды всех символов в строке не превышают 127.

//Создайте функцию, которая реализует алгоритм второго задания первой
//практической работы, в которую все числа, слова или пары (в зависимости
//от варианта) передаются в аргументах функции. Например: f(123,25,222);
//f("dfd "dd "ddd"); d (Pair(2,3),Pair(3,5),Pair(4,1)).

fun funVarargString(vararg stringArg: String):String{
    var string = ""
    var stringReturn = ""
    val one = 1
    var exit = 0
    var countWords = 0//= one
    val arr = Array(127) {0}
    var arr1 = Array(127){-1}
    for (str in stringArg) {
        string += str + "\n"
    }
    if (string!= "") {
        for(firstChar in string){
            val charCode = firstChar.code
            if(firstChar == '\n' ) {
                arr1 = Array(127){-1}
                countWords +=one
            }
            else {
                if(arr1[charCode] < 0){
                    arr1[charCode] += one
                    arr[charCode] += one
                }
            }
        }
        for (i in arr){
            if (i == countWords-2)
                stringReturn += exit.toChar()
            exit++
        }
        return stringReturn
    } else {
        return "Ничего не введено("
    }
}

fun main(){
    println("str = ${funVarargString("xu","xu","xi","xi","ui","ui4")}")
}