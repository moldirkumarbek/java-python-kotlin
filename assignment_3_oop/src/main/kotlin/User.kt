//super class
open class User {

    var username: String
    var password: String

    constructor(username: String, password: String) {

        this.username = username
        this.password = password
    }

    open fun doWork() {
        println("Some users work...")
    }

    open fun printData() {
        println("$username - $password is user")
    }
}