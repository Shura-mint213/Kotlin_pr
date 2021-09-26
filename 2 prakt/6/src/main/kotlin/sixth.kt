//Создайте функцию, которая по данной функции f : Float− > Float и
//числу x возвращает функцию, которая при каждом вызове последо-
//вательно возвращает f(x), f(f(x)), f(f(f(x))), . . ..
fun f(count:Int, vararg func:(Float)->Float):(Float)->Float{
    return {x->
        var n = 0
        var result = 0.0f
        while(n<=count) {
            for (twoF in func)
                result = twoF(x)
            n++
            println("count $n")
        }
        result
    }
}

fun main(){
    val x = 3
    val count = 3

    println("f = ${f(count,{x->x*x},{x->2*x})}")
    val funcPrint = f(count,{x->x*x},{x->2*x})
    println(funcPrint)
}