package Assignment2.SectionC_Inheritance

open class Person(val name: String, val age: Int) {
    open fun introduce() {
        println("I am $name, $age years old.")
    }
}

class Teacher(name: String, age: Int, val subject: String) : Person(name, age) {
    override fun introduce() {
        println("I am $name, $age years old. I teach $subject.")
    }
}

class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    override fun introduce() {
        println("I am $name, $age years old. I am in grade $grade.")
    }
}

fun main() {
    val teacher = Teacher("Mr. Sharma", 40, "Mathematics")
    val student = Student("Rohan", 16, "11th")

    teacher.introduce()
    student.introduce()
}
