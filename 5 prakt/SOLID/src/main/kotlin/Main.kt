import Data.StudentFull
import Interfaces.IPerson

//База данных студентов колледжа. Поля: ФИО, группа, признак бюд-
//жетности, стипендия (нет/обычная/повышенная), флаг наличия со-
//циальной стипендии, дата рождения.

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
class Person(firstNameNew: String, surnameNew: String, patronymicNew: String): IPerson {
    override var name = firstNameNew
    override var surname = surnameNew
    override var patronymic = patronymicNew
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
            OutputData().manual()
            key = readLine().toString()
            when (key) {
                "1" -> list = InputDataStudent().dataEntry(list)
                "2" -> OutputData().outputAllDataList(list)
                "3" -> list = DataSort().sortFIOName(list)
                "4" -> InputDataStudent().entryNameForSearch(list)
                "5" -> list = EditData().editList(list)
                "0" -> list = DeleteData().deleteStudent(list)

            } // 2 принцип для расширения бобо
        }
    }
}

fun main() {
    Menu().mainMenu()
}