package konspect
//SOLID
//S: single responsibility - единая ответственность
//каждый класс отвечает за что-то одно
//O: open-closed principle
//открыт для  расширений закрыт для изменений
//L: Liskov.. principle
//четкая иерархия, классового наследования
//I: interface segregation
//интерфейс у объекта нужно делить на части которые разумны в объекте
//D: dependency injection (внедрения зависимостей)
//в файле SOLIDSecond.kt

interface HasName{
    var name: String
}

interface HasAge{
    var age: Int

    fun incAge() {
        age++
    }
}

open class Person1(n: String, a: Int) : HasName, HasAge {
    override var name: String = n
        set(value){
            if (value != "")
                field = value
        }

    override var age: Int = a
}
class Auto(override var name: String, val count: Int) : HasName

class Student21(n: String, a: Int, var org: String): Person1(n,a)

class Planet(override var age: Int, val m:Double) : HasAge

class InputPerson {
    fun input(): Person1 {
        var name = readLine()!!
        var age = readLine()!!.toInt()
        return Person1(name, age)
    }

}
class PrintPerson {
    fun print(p: Person1){
        println("${p.name} ${p.age}")
    }
}

fun year10(hasAge: HasAge){
    for(i in 1..9) hasAge.incAge()
}

fun main(){
    //нарушено принцип Liskov----
    //class Auto(n: String, a: Int) : Person1(n,a)
//    val per:Person1 = Auto("BMV",4)
//    println("сегодня день рождения ${per.name}")
//    println("Ему было ${per.age}")
//    per.incAge()
//    println("Сейчас ему ${per.age}")
//    ---------------------------------------
    val p = Person1("Ифанов", 9)
    val a = Auto("BMV", 5)
    val l = listOf(a,p)

    l.forEach{ println(it.name)}
}