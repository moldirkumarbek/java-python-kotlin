//class inheritance
class Admin(username: String, password: String, permissions: String) : User(username, password) {

    val permissions: String = permissions

    override fun doWork() {
        println("Some admin work...")
    }

    override fun printData() {
        println("$username - $password is admin")
    }
}