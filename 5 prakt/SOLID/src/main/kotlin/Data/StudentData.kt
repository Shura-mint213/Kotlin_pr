package Data

import Person

//<summary>
// Класс data который хранит все поля "таблицы студент"
//</summary>
data class Student(val FIO:Person, val group: String,val budgetOrder: String,
                   val scholarship: String, val scholarshipFlag: String, val birthday: String)
