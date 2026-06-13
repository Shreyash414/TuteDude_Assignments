open class Animal(val name: String) {
    open fun makeSound() {
        println("$name makes a sound.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Woof!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Meow!")
    }
}

class Cow(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Moo!")
    }
}

fun main() {
    val animals: List<Animal> = listOf(Dog("Bruno"), Cat("Whiskers"), Cow("Daisy"), Dog("Max"))

    for (animal in animals) {
        animal.makeSound()
    }
}
