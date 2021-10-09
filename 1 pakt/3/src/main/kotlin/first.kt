//максимальная цифра среди стоящих на позициях в числе, номера ко-
//торых кратны четырем (если нумеровать цифры с конца): для числа
//1234 ответ 1
fun main(){
    val string = readLine()
    var number: Int
    var oldNumber: Int
    var count = 0
    var max = 0
    var err = 0
    if (string!=null){

        for (i in string) {
            if (i.code < 48 || i.code > 57)
                err = -1
            else
                count++
        }
        if (err == 0){
            number = string.toInt()
            oldNumber =number
            while (oldNumber != 0){
                oldNumber/=1000
                number=oldNumber%10
                oldNumber/=10
                if (max<number)
                    max = number
            }
            println("max = $max")
        }
        else println("Упс! простите но вы ввели не только цифры(")
    }
    else println("Ошибка( String == null")
}