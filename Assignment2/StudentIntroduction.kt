class Student(val name: String, val rollNumber: Int) {
    fun introduce() {
        println("Hi, my name is $name and my roll number is $rollNumber.")
    }
}

fun main() {
    val s1 = Student("Aarav", 101)
    val s2 = Student("Priya", 102)
    s1.introduce()
    s2.introduce()
}
