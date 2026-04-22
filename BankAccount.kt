package sectionB

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: ₹$amount")
        } else {
            println("Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrawn: ₹$amount")
        } else {
            println("Insufficient balance or invalid amount")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount()
    account.deposit(5000.0)
    account.withdraw(2000.0)
    println("Current Balance: ₹${account.getBalance()}")
    account.withdraw(4000.0) // Should fail
}