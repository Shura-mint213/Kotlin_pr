//максимальная цифра среди стоящих на позициях в числе, номера ко-
//торых кратны четырем (если нумеровать цифры с конца): для числа
//1234 ответ 1

//как обычную функцию;
fun usualFun3(string: Int,newUsualFun:(Int,Int)->Int):Int{
    var number: Int = string
    var oldNumber: Int = number
    var max = 0
    while (oldNumber != 0){    //ищим число кратное 4
        oldNumber/=1000
        number=oldNumber%10
        oldNumber/=10
        max = newUsualFun(max,number)
    }
    return max
}
// tailRec-функцию.
tailrec fun tailFun3(OldNumber: Int, newTailFun:(Int,Int)->Int, max: Int = 0):Int{
    val maxNew: Int
    val oldNumberNew :Int = OldNumber
        maxNew = newTailFun(max,oldNumberNew)
    return if (oldNumberNew/10000 == 0)
        maxNew
    else
        return tailFun3(oldNumberNew/10000, newTailFun,maxNew)
}
fun main(){
    val string = readLine()
    var count = 0
    val usualMax: Int
    val tailMax: Int
    val oldNumber: Int
    var err = 0
    if (string!=null){

        for (i in string) {
            if (i.code < 48 || i.code > 57)
                err = -1
            else
                count++
        }
        if (err == 0){
            oldNumber = string.toInt()
            usualMax = usualFun3(oldNumber) { max, number -> if (max < number) number else max }
            println("UsualFun max = $usualMax")
            tailMax = tailFun3(oldNumber, {max,oldNumberNew -> if (max < oldNumberNew/1000%10)
                oldNumberNew/1000%10 else max})
            println("tailMax max = $tailMax")
        }
        else println("Упс! простите но вы ввели не только цифры(")
    }
    else println("Ошибка( String == null")
}