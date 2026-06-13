open class Animal(val name: String) {
    open fun eat() {
        println("$name is eating.")
    }

    open fun sleep() {
        println("$name is sleeping.")
    }
}

class Dog(name: String) : Animal(name) {
    fun bark() {
        println("$name says: Woof! Woof!")
    }
}

fun main() {
    val dog = Dog("Bruno")
    dog.eat()
    dog.sleep()
    dog.bark()
}
