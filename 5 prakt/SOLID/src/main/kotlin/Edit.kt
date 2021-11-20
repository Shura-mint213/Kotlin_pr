import Data.StudentFull

class EditData{
    fun editList(list: StudentFull?): StudentFull? {
        val listNew: StudentFull? = DeleteData().deleteStudent(list)
        return InputDataStudent().dataEntry(listNew)
    }
}