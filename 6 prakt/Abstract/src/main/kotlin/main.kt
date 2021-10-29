//Создайте функцию, которая по данной функции f : T− > T и числу n
//возвращает функцию f(f(f(...f(x)...), где f вызывается n раз. Здесь
//T – любой тип.

fun <T>func( n: Int, value:(T)->T):(T)->T{
    return {x->
        var result = x
        var count = 0
        while (count<n){
            result = value(result)
            count++
        }
        result
    }
}

fun main(){
    val f1 = func(3) {x:Int->x*x}
    val f2 = func(3){x:String->x+x}
    println(f1(2))
    println(f2("adc"))
}
