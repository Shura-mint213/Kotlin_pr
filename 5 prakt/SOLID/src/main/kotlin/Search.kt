import Data.Student
import Data.StudentFull

//<summary>
//Поиск
//Поиск по заданной строке
//</summary>
class DataSearch{
    fun searchName(name: String?=null,listNew: StudentFull?){
        OutputData().outputAllDataList(StudentFull(listNew?.student?.
        filter { it.FIO.name == name } as MutableList<Student>))
    }
}