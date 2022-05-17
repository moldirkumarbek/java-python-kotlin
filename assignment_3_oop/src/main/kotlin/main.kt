fun main(args: Array<String>) {
    println("Hello World!")

    showPolymorphism()
    showAbstract()
}


//polymorphism
fun showPolymorphism() {
    val usersList: MutableList<User> = mutableListOf()
    usersList.add(User("user 1", "pass 1"))
    usersList.add(Manager("manager 1", "manager 1", 230.0))
    usersList.add(Admin("admin 1", "admin 1", "delete user,add user"))
    usersList.add(User("user 2", "pass 2"))
    usersList.add(Admin("admin 2", "admin 2", "add posts, update posts"))

    usersList.forEach {
        it.printData()
    }

    usersList.forEach {
        it.doWork()
    }
}

fun showAbstract() {
    //cant create abstract class
    //val h = Human()
    val p = Person("Evgenii", 19, "123456789", "Kazakh")
    p.showPersonData()
}