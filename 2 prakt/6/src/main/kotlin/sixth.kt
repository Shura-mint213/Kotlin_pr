//Создайте функцию, которая по данной функции f : Float− > Float и
//числу x возвращает функцию, которая при каждом вызове последо-
//вательно возвращает f(x), f(f(x)), f(f(f(x))), . . ..
fun f(count:Int, func:(Float)->Float):(Float)->Float{
    return {x->
        var n = 0
        var result = x
        while(n<count) {
            result = func(result)
            n++
            println("count $n")
        }
        result
    }
}
fun main(){
    val count = 3

    println("f = ${f(count) { x -> x }}")
    val funcPrint = f(count) { x -> x + x }
    println(funcPrint(3f))
}
//x:='asds'+'adsada';y:=2+3 div  ;
