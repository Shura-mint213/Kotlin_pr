//максимальная цифра среди стоящих на позициях в числе, номера ко-
//торых кратны четырем (если нумеровать цифры с конца): для числа
//1234 ответ 1

//Реализуйте задания No1-3 первой практической ра-
//боты с использованием функционального подхода в одно выражение каждое
//(без учета ввода-вывода).

// найти четные элементы потом взять получившееся и анйти макс

fun main(){
    val string = readLine()
    var count = 0
    var err = 0
    if (string!=null){

        for (i in string) {
            if (i.code < 48 || i.code > 57)
                err = -1
            else
                count++
        }
        if (err == 0){
            println("max = ${string.reversed().map{it.code - '0'.code }.
                filterIndexed{Index,_-> (Index+1)%4 == 0 }.maxOrNull()
            }")
        }
        else println("Упс! простите но вы ввели не только цифры(")
    }
    else println("Ошибка( String == null")
}
