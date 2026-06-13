class Car(val brand: String, val model: String, val price: Double) {
    fun printDetails() {
        println("Brand: $brand | Model: $model | Price: ₹$price")
    }
}

fun main() {
    val car1 = Car("Toyota", "Innova", 1800000.0)
    val car2 = Car("Honda", "City", 1200000.0)
    val car3 = Car("Maruti", "Swift", 700000.0)

    car1.printDetails()
    car2.printDetails()
    car3.printDetails()
}
