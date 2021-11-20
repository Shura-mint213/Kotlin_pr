import Data.StudentFull

//<summary>
// Вывод двнных
// Происходит вывод всех данных в списке которые имеются на данный момент
//</summary>
class OutputData{
    fun outputAllDataList(list: StudentFull?){
        list?.student?.forEachIndexed{ count,it->
            println("${count+1} Surname: ${it.FIO.surname}\tName: ${it.FIO.name}\t" +
                    "Patronymic: ${it.FIO.patronymic}\tGroup: ${it.group}\t" +
                    "Budget order: ${it.budgetOrder}\tScholarship: ${it.scholarship}\t" +
                    "Scholarship flag: ${it.scholarshipFlag}\t Birthday: ${it.birthday}")
        }
    }
    fun manual(){
        println("Выберите действия:\n\t1: Adding data\n\t" +
                "2: Show Data\n\t3: Sorting Data\n\t" +
                "4: Search Data\n\t0: Exit")
    }
    fun surnameTextPrint() = println("Введите Фамилию студента")
    fun nameTextPrint() = println("Введите Имя студента")
    fun patronymicTextPrint() = println("Ведите Отчества студента")
    fun groupTextPrint() = println("Введите группу студента")
    fun budgetTextPrint() = println("Признак бюджетности")
    fun scholarshipTextPrint() = println("Стипендия")
    fun socialScholarshipTextPrint() = println("Наличие социальной степендии")
    fun birthdayTextPrint() = println("Введите дату рождения")
}

