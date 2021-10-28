enum class mark(val mark: Int){
    Excellent(5),
    Good(4),
    NotBad(3),
    Bad(2)
}

enum class weekday{
    Monday{
        override fun print(){
            println("Понедельник")
        }
    },
    Tuesday{
        override fun print(){
            println("Вторник")
        }
    },
    Wednesday{
        override fun print(){
            println("Среда")
        }
    },
    Thursday{
        override fun print(){
            println("Четверг")
        }
    },
    Friday{
        override fun print(){
            println("Пятница")
        }
    },
    Sunday{
        override fun print(){
            println("Суббота")
        }
    };
    abstract fun print()
}
data class Student1(val lastName: String,val firstName: String,val mark: Int){
//data class - в таких классах хронится информация
}

fun main(){
    val st = Student1("Иванов","Иван",4)
    val st2 = Student1("Иванов","Иван",4)
    println(st.toString())
//    println(st == st2)
//    val (a,b,c) = st2
//    st2.component1()
//    val st3 = st2.copy(mark = 3)
//    --------enum class
    val v: weekday = weekday.Wednesday
    v.print()
    val m: mark = mark.Excellent
    println(m.mark)
    enumValues<weekday>().forEach{
        it.print()
    }
}