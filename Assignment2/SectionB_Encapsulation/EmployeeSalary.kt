package Assignment2.SectionB_Encapsulation

class Employee(val name: String) {
    private var salary: Double = 0.0

    fun setSalary(amount: Double) {
        if (amount < 0) {
            println("Salary cannot be negative.")
        } else {
            salary = amount
            println("Salary set to ₹$salary for $name.")
        }
    }

    fun getSalary(): Double {
        return salary
    }
}

fun main() {
    val emp = Employee("Rahul")
    emp.setSalary(50000.0)
    println("Current salary: ₹${emp.getSalary()}")
    emp.setSalary(-5000.0)
    emp.setSalary(65000.0)
    println("Updated salary: ₹${emp.getSalary()}")
}
