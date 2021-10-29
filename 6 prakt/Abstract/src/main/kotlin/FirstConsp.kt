class test{
    lateinit var testProrerty: String

    fun init(s: String){
        testProrerty = s
    }

    fun getString():String? = if (this::testProrerty.isInitialized) testProrerty else null

}

//generic-классы
class Quarter<T1,T2,T3,T4>(var first:T1, var second:T2, var third:T3, var forth:T4){
    override fun toString(): String {
        return "first = ${first.toString()} second = ${second.toString()} " +
                "third = ${third.toString()} forth = ${forth.toString()}"
    }
}

fun main() {
    val q = Quarter("Иванов","ПКС-404", 1977, 5)
    println("q = $q")
}