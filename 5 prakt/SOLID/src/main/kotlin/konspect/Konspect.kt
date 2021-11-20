import kotlin.math.sqrt

interface onChange{
    fun execute(newx: Int, newy: Int)
}
interface Printable{
    fun print(){
        println("Exit")
    }
    var isPointed:Boolean
}


open class Point (xOrigin: Int, yOrigin: Int) {//чтобы наследоваться от класса нужно написать open

//class Point constructor(xOrigin:Int, yOrigin:Int){
// с полем работать нельзя
//    var x: Int = xOrigin
//    var y: Int = yOrigin
    var x = xOrigin
        get() = field + 10
        private set(v){
            field = x - 10
        }
    var y = yOrigin
        private set
    open fun move(xNew: Int, yNew: Int){ // чтобы переопределить метод нужно писать open
        x = xNew
        y = yNew
        listener.execute(xNew,yNew)
    }

    private lateinit var listener: onChange

    fun  registerListener(listener : onChange){
        this.listener = listener
    }
    var visible: Boolean = false
    val distance: Double
        get() =  sqrt((x*x+y*y).toDouble())
    constructor(p: Point):this(p.x,p.y){

    }
    class PointPrint(val message: String){

    }
    open fun print(){
        println("point")
    }
    companion object { // соответствует целиком классу, сущестует в единственном экземпляре
        var count: Int = 0
    }
    // все что внутри init войдет в первичный констуктор
    init { //для того чтобы писать еще чтото в конствукторе
        count++
    }
}
class ColoredPoint(xOrigin: Int, yOrigin: Int,val color: Int):Point(xOrigin,yOrigin),Printable{
    override fun move(xNew: Int, yNew: Int) {
        super.move(xNew, yNew)//для обращения к методу из родительского класса используется суппер
    }

    override var isPointed: Boolean
        get() = true//заглушка
        set(value) {}

    override fun print() {
        super<Printable>.print()
    }


}
fun main(){
//    val o = object {
//        val u: Int = 5
//    }

    val p = Point(2,3)
//    println(p.x)
//    println(p.y)
//    println(p.visible)
//    println(p.distance)
//    val p2 = Point(p)
//    val c = ColoredPoint(2,3,3)
//    println("p2 = ${p2.distance}")
//    c.print()
//    p.move(10,20)
//    println("p.Move() x = ${p.x} y = ${p.y}")
//    println("count = ${Point.count}"
//    ----------
    p.registerListener(object: onChange{
        override fun execute(newx: Int, newy: Int) {
            TODO("Not yet implemented")
        }
    })
}