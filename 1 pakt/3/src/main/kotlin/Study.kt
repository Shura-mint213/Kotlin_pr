import java.util.*
import javax.swing.Painter

tailrec fun sum2(n: Int, s: Int = 0):Int = if (n == 0) s else sum2(n/10,s+n%10)

fun example(n1: Int, n2:Int, f:(Int)->Boolean){
    if (f(n1)) 1 else 0 + if (f(n2)) 1 else 0
}

fun sum(n: Int): Int{
    var s: Int = 0
    var nn = n
    while (n>0){
        s+nn%10
        nn/=10
    }
    return s
}

fun sum(vararg f:Int):Int { // 3 pract
    var s = 0
    for (i in f){
        s+=i
    }
    return s
}

fun subadd(n:Int, m:Int):Pair<Int, Int> {
    return Pair(n-m,m+n)
}
fun add(vec1:Pair<Double,Double>,vec2:Pair<Double,Double>) =
    (vec1.first+vec2.first) to (vec1.second+vec2.second) //Pair

fun myfunc(vararg flist:(Int)->Int):(Int)->Int {
    return { x ->
        var res = 0.inv()
            for (f in flist) {
                res = res and f(x)
            }
        res
    }
}
fun add(f1:(Int)->Int,f2:(Int)->Int):(Int)->Int {
    return {x->f1(x)+f2(x)}
}

fun mul(f1:(Int)->Int,f2:(Int)->Int):(Int)->Int {
    return {x->f1(x)*f2(x)} // высшего порядка
}

fun main(){
    //var s = readLine()
    val l = listOf(2,3,5)
    val l2 = mutableListOf(2,3,5)
    l2.add(2)
    //mutable и не mutebal
    val s = setOf(24,1)
    val m = mapOf("Иванов" to 3, 2 to "lol")
    println(m.get(2))
    val x = Pair(2,64)
    val x2 = Pair(3,53)
    val x3 = Pair(sum(2,4)) { 1 + 2 }
    val (res,ser) = subadd(3,5)
    //println(sum(3,67,4))

    val f = myfunc({x->x+2},{x->x*x*x},{x:Int->kotlin.math.abs(x)})
    println(f(1))



    //println(s.toString().toInt()/1000)
    //println(example(s.toString().toInt(),n2.toString().toInt()))
}