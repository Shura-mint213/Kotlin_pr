import Data.Student
import Data.StudentFull

//<summary>
// Ввод данных
// Вводим данные с клавиатуры, тем самым заполняя список данных
//</summary>
class InputDataStudent{
    fun dataEntry(listNew: StudentFull?):StudentFull? {
        var list = listNew
        OutputData().surnameTextPrint()
        val surname = readLine().toString()
        OutputData().nameTextPrint()
        val name = readLine().toString()
        OutputData().patronymicTextPrint()
        val patronymic = readLine().toString()
        OutputData().groupTextPrint()
        val group = readLine().toString()
        OutputData().budgetTextPrint()
        val budget = readLine().toString()
        OutputData().scholarshipTextPrint()
        val scholarship = readLine().toString()
        OutputData().socialScholarshipTextPrint()
        val socialShort = readLine().toString()
        OutputData().birthdayTextPrint()
        val dayBirthday = readLine().toString()
        val monthBirthday = readLine().toString()
        val yearBirthday = readLine().toString()

        if (list == null)
            list = StudentFull()
        list?.student?.
        add(
            Student(Person(surname, name, patronymic),
            group, budget, scholarship, socialShort,"$dayBirthday.$monthBirthday.$yearBirthday"
            )
        )
        return list
    }
    fun entryIndex():Int{
        return readLine()!!.toInt()
    }
    fun entryNameForSearch(listNew:StudentFull?){
        val name = readLine()
        DataSearch().searchName(name,listNew)
    }
}