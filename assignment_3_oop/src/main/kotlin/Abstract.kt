//abstract class
abstract class Human(name: String, age: Int) {
    val name = name
    val age = age

    fun showHumanData() {
        println("Human data: $name $age")
    }
}


class Person(name: String, age: Int, IIN: String, nationality: String) : Human(name, age) {
    val IIN = IIN
    val nationality = nationality

    fun showPersonData() {
        super.showHumanData()
        println("Person data: $IIN $nationality")
    }
}