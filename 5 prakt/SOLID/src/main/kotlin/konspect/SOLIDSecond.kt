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
interface ChangeName{
    fun changeReaction(oldName:String, newName: String){
    }
}
class Person3(n: String){
    var name: String = n
        set(value){
            listener?.changeReaction(field, value)
            field = value
        }
    private var listener: ChangeName? = null
    fun registerListener(listener: ChangeName?){
        this.listener = listener
    }
}

fun main() {
    val p = Person3("Иван")
    p.registerListener(object: ChangeName{
        override fun changeReaction(oldName: String, newName: String) {
            println("$oldName -> $newName")
        }
    })
    p.name = "Первович"
    p.name = "Фуксия "
}