//function insert (el: T,n: Int): Bool Bool вставляет элемент на пози-
//цию n (нумерация идет с единицы) с начала списка;

//fun delete(): Bool удаляет элемент с конца списка

//fun print():Unit печатает последний элемент списка
class List(private var list: MutableList<String> = mutableListOf()) {
    fun <T>insert(el: T, n: Int): Boolean{
        val sizeList = list.size
        if(n-1 in 0..sizeList) list.add(n-1 ,el.toString())
        return list.size > sizeList
    }
    fun delete(): Boolean{
        val sizeList = list.size
        if(list.isNotEmpty()) list.removeAt(sizeList-1)
        return sizeList < list.size
    }
    fun print(): Unit = if(list.isNotEmpty()) println("last = ${list.last()}") else print("list empty")
    fun printAll() = list.forEachIndexed { index, s -> println("$index. $s")}
}

fun main() {
    val list = List()
    list.insert("dw",1)
    println(list.insert(2,2))
    list.insert("d531",1)
    println(list.insert("keen",3))
    list.insert("lol",6)
    list.insert("lol",4)
    list.printAll()
    list.delete()
    list.delete()
    list.printAll()
    list.print()
}