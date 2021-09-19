//С клавиатуры вводится несколько строк, последняя строка – пустая
//(пустая строка – признак окончания ввода и дальше игнорируется).
//Выведите символы, что отсутствуют ровно в двух строках. Предпола-
//гается, что коды всех символов в строке не превышают 127.
fun main(){
    var string = ""
    var newString = ""
    var count = 0
    val one = 1
    var err = 0
    var errTwoString = 0
    var exit = 0
    var countWords = 0//= one
    val arr = Array(127) {0}
    var arr1 = Array(127){-1}
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
                print("${exit.toChar()}")
            exit++
        }
    } else println("Ничего не введено(")
}
