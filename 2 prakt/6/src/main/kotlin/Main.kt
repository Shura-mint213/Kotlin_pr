//максимальная цифра среди стоящих на позициях в числе, номера ко-
//торых кратны четырем (если нумеровать цифры с конца): для числа
//1234 ответ 1+

//как обычную функцию;
fun usualFun(string: Int):Int{
    var number: Int = string
    var oldNumber: Int = number
    var max = 0
    while (oldNumber != 0){    //ищим число кратное 4
        oldNumber/=1000
        number=oldNumber%10
        oldNumber/=10
        if (max<number)
            max = number
    }
    return max
}
// tailRec-функцию.
tailrec fun tailFun(OldNumber: Int,max: Int = 0):Int{
    var maxNew :Int = max
    val oldNumberNew :Int = OldNumber
    if (max<oldNumberNew/1000%10)
        maxNew = oldNumberNew/1000%10
    return if (oldNumberNew/10000 == 0)
         maxNew
    else
        return tailFun(oldNumberNew/10000,maxNew)
}

fun main(){
    val string = readLine()
    var count = 0
    val usualMax: Int
    var tailMax: Int
    val zero = 0
    var err = 0
    if (string!=null){

        for (i in string) {
            if (i.code < 48 || i.code > 57)
                err = -1
            else
                count++
        }
        if (err == 0){
            tailMax = string.toInt()
            usualMax = usualFun(tailMax)
            println("UsualFun max = $usualMax")
            tailMax = tailFun(tailMax)
            println("tailMax max = $tailMax")
        }
        else println("Упс! простите но вы ввели не только цифры(")
    }
    else println("Ошибка( String == null")
}