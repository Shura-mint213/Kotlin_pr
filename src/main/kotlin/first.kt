fun main(){
    val string = readLine()
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
            val array = Array(count) {""}
            count = 0
            for (i in string) {
                array[count] = i.toString()
                count++
            }
            while (count > 0){
                count-=4
                if (count>=0)
                    if (array[count].toInt()>max)
                        max = array[count].toInt()
            }
            println("max = $max")
        }
        else println("Упс! простите но вы ввели не только цифры(")
    }
    else println("Ошибка( String == null")
}