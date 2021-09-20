package part1.sec2

// data class basics


interface PeopleBehaves {
    fun <V> sayYo(): V
    fun <V> greet(): V
}


data class NamedOBJ(open val name: String, open val id: String)

data class Student(val obj: NamedOBJ) : PeopleBehaves {

    override fun <V> sayYo(): V {
        println("I'm ${obj.name}. Say YO!")
        return this as V
    }

    override fun <V> greet(): V {
        println("I'm ${obj.name}. Hello!")
        return this as V
    }
}

data class Teacher(val obj: NamedOBJ) : PeopleBehaves {

    override fun <V> sayYo(): V {
        println("I'm ${obj.name}. ...")
        return this as V
    }

    override fun <V> greet(): V {
        println("I'm ${obj.name}. Hi")
        return this as V
    }
}

fun main() {
    val c3po = NamedOBJ(name = "C3PO", id = "23")
    val studentC3PO: Student = Student(obj = c3po).greet<Student>().sayYo()
    val teacherC3PO: Teacher = Teacher(obj = c3po).greet<Teacher>().sayYo()

    println(studentC3PO)
    println(teacherC3PO)
}
