fun<T> swap (x: T, y: T) = Pair(x,y) //generic - функция

fun<T> add(x: (T)->Double, y: (T)->Double):(T)->Double = {x(it)+y(it)}


fun main(){
    println(swap(2,3))
    val ad = add<Int>({(it+it).toDouble()},{(it*it).toDouble()})
    println("fun add = ${ad(3)}")
}