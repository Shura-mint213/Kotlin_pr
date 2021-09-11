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

fun main(){
    //val ar = Array(10) { it }
    var s = readLine()
    //val n2 = readLine()
    println(s.toString().toInt()/1000)
    //println(example(s.toString().toInt(),n2.toString().toInt()))
}