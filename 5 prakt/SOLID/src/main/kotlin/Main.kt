import java.awt.List
import kotlin.contracts.contract
//База данных студентов колледжа. Поля: ФИО, группа, признак бюд-
//жетности, стипендия (нет/обычная/повышенная), флаг наличия со-
//циальной стипендии, дата рождения.

interface IPerson{
    val name: String
    val surname: String
    val patronymic: String
}
//<summary>
//Степендия
//В создаем перечеслимом тепе типы степендии
//</summary>
enum class Scholarship{
    Not,
    Usual,
    Increased
}

//<summary>
//Некий абстрактный класс человек для последующего наследования с полями
//</summary>
class Person(firstNameNew: String, surnameNew: String, patronymicNew: String): IPerson{
    override var name = firstNameNew
    override var surname = surnameNew
    override var patronymic = patronymicNew
}

//<summary>
// Класс data который хранит все поля "таблицы студент"
//</summary>
data class Student(val FIO:Person, val group: String,val budgetOrder: Boolean,
        val scholarship: String, val scholarshipFlag: Boolean){ }

//<summary>
// Класс data где хранится сивок студентов со всеми полями
//</summary>
data class StudentFull(val student: MutableList<Student> = mutableListOf()){ }

//<summary>
// Вывод двнных
// Происходит вывод всех данных в списке которые имеются на данный момент
//</summary>
class DataOutput{
    constructor(list:StudentFull?){
        list?.student?.forEach{
            println("Surname: ${it.FIO.surname}\tName: ${it.FIO.name}\t" +
                    "Patronymic: ${it.FIO.patronymic}\tGroup: ${it.group}\t" +
                    "Budget order: ${it.budgetOrder}\tScholarship: ${it.scholarship}\t" +
                    "Scholarship flag: ${it.scholarshipFlag}")
        }
    }
}

//<summary>
//Сортирока
//Сортируем список по выброному полю
//</summary>
class DataSort{
    fun FIOName(listNew:StudentFull?):StudentFull?{
        return StudentFull(listNew?.student?.sortedBy { it.FIO.name } as MutableList<Student>)
    }
}

//<summary>
//Поиск
//По заданной строке
//</summary>
class DataSearch{
    fun SearchName(name: String?=null,listNew: StudentFull?){
        DataOutput(StudentFull(listNew?.student?.filter { it.FIO.name == name } as MutableList<Student>))
    }
}

//class DataDelete{
//    fun DeleteName(name: String?=null,listNew: StudentFull?):StudentFull{
//todo делать удаление
//    }
//}

//<summary>
// Ввод данных
// Вводим данные с клавиатуры, тем самым заполняя список данных
//</summary>
class DataEntry{
    fun dataEntry(listNew:StudentFull?):StudentFull? {
        var list = listNew
        println("Введите Фамилию студента")
        val surname = readLine().toString()
        println("Введите Имя студента")
        val name = readLine().toString()
        println("Ведите Отчества студента")
        val patronymic = readLine().toString()

        if (list == null)
            list = StudentFull()
        list?.student?.
        add(Student(Person(surname, name, patronymic),
            "ПКС-404", true, Scholarship.Not.toString(), false))
        return list
    }
    fun EntryNameForSearch(listNew:StudentFull?){
        val name = readLine()
        DataSearch().SearchName(name,listNew)
    }
    //todo сделать удаление
//    fun EntryNameForDelete(listNew:StudentFull?):StudentFull{
//        listNew.student.in
//        val name = readLine()
//        return DataDelete().DeleteName(name, listNew)
//    }

}

//<summary>
//Меню
//Здесь реальзуется меню выбора взаимодействия с данными
//</summary>
class Menu {
    fun mainMenu() {
        var key = ""
        var list: StudentFull?=null
        while(key != "e") {
            println("Выберите действия:\n\td: Adding data\n\t" +
                    "r: Show Data\n\ts: Sorting Data\n\t" +
                    "l: Search Data\n\te: Exit")
            key = readLine().toString()
            when (key) {
                "d" -> list = DataEntry().dataEntry(list)
                "r" -> DataOutput(list)
                "s" -> list = DataSort().FIOName(list)
                "l" -> DataEntry().EntryNameForSearch(list)
//                "d" -> list = DataDelete().DeleteName(list)
            } // 2 принцип для расширения бобо
        }
    }
}

fun main() {
    Menu().mainMenu()
}