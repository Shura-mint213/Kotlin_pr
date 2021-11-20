import Data.Student
import Data.StudentFull

//<summary>
//Сортирока
//Сортируем список по выброному полю
//</summary>
class DataSort{
    fun sortFIOName(list: StudentFull?):StudentFull?{
        return StudentFull(list?.student?.sortedBy { it.FIO.name } as MutableList<Student>)
    }
}