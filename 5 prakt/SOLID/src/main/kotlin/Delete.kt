import Data.StudentFull
import Interfaces.IDeleteStudent



//<summary>
//Удаление
//Здесь реальзуется удаление по выбраному индексу, элемента списка
//</summary>
class DeleteData : IDeleteStudent {
    override fun deleteStudent(list: StudentFull?):StudentFull?{
        OutputData().outputAllDataList(list)
        list?.student?.removeAt(InputDataStudent().entryIndex()-1)
        return list
    }
}