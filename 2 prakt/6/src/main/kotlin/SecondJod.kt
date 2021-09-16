//максимальная цифра среди стоящих на позициях в числе, номера ко-
//торых кратны четырем (если нумеровать цифры с конца): для числа
//1234 ответ 1
//В программе, вынесите проверяемое условие в
//отдельную single-expression функцию.
fun usualFunExp(number: Int,max: Int = 0):Int = if (max<number) number else max // for usual function

//как обычную функцию;
fun usualFun2(string: Int):Int{
    var number: Int = string
    var oldNumber: Int = number
    var max = 0
    while (oldNumber != 0){    //ищим число кратное 4
        oldNumber/=1000
        number=oldNumber%10
        oldNumber/=10
        max = usualFunExp(max,number)
    }
    return max
}
fun tailFunExp(max: Int = 0, oldNumberNew: Int): Int = if (max<oldNumberNew/1000%10) oldNumberNew/1000%10 else max
// tailRec-функцию.
tailrec fun tailFun2(OldNumber: Int, max: Int = 0):Int{
    val maxNew: Int
    val oldNumberNew :Int = OldNumber
        maxNew = tailFunExp(max,oldNumberNew)
    return if (oldNumberNew/10000 == 0)
        maxNew
    else
        return tailFun2(oldNumberNew/10000, maxNew)
}
fun main(){
    val string = readLine()
    var count = 0
    val usualMax: Int
    var tailMax: Int
    var oldNumberNew = 0
    var err = 0
    if (string!=null){

        for (i in string) {
            if (i.code < 48 || i.code > 57)
                err = -1
            else
                count++
        }
        if (err == 0){
            oldNumberNew = string.toInt()
            usualMax = usualFun2(oldNumberNew)
            println("usualFun max = $usualMax")
            tailMax = tailFun2(oldNumberNew)
            println("tailMax max = $tailMax")
        }
        else println("Упс! простите но вы ввели не только цифры(")
    }
    else println("Ошибка( String == null")
}