class BankAccount(initialBalance: Double) {
    private var balance: Double = initialBalance

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited ₹$amount. New balance: ₹$balance")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds. Current balance: ₹$balance")
        } else if (amount <= 0) {
            println("Withdrawal amount must be positive.")
        } else {
            balance -= amount
            println("Withdrew ₹$amount. New balance: ₹$balance")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount(5000.0)
    println("Opening balance: ₹${account.getBalance()}")
    account.deposit(2000.0)
    account.withdraw(1500.0)
    account.withdraw(8000.0)
    println("Final balance: ₹${account.getBalance()}")
}
