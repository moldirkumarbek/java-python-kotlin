//class inheritance
class Manager(username: String, password: String, salary: Double) : User(username, password) {

    val salary: Double = salary

    override fun doWork() {
        println("Some manager work...")
    }

    override fun printData() {
        println("$username - $password is manager")
    }

}