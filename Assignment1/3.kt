package Assignment1


fun main(){
    println(task1())
    println(task2())
    println(task3())
    println(task4())
    println(task5())
    println(task6())
}
fun task2(){
    println("#2\n")
    val x = -5
    if (x > 0) {
        val x1: Int =  x + 1
        kotlin.io.println("It is  positive: $x1")
    }
    else{
        val x2: Int = x-2
        println("It is '-' : $x2")
    }
}

fun task1(){
    var x = 6
    println("#1\n")
    if (x > 0) {
        val x1: Int =  x + 1
        kotlin.io.println("It is  positive: $x1")
    }
    else{
        println("the given number is: $x")
    }
}

fun task3(){
    val x = 0
    if(x>0){
        println(x+1)
    }
    else if(x<0){
        println(x-2)
    }
    else{
        println(10)
    }
}

fun task4(){
    val year: Int = 300
    if(year % 4 == 0){
        if (year % 100 == 0){
           if (year % 400 == 0){
               println("leap year")
           }
            else{
                println("not leap year")
           }
        }
        else{
            println("leap year")
        }
    }
    else{
        println("no leap year")
    }
}

fun task5(){
    val a = 0
    if (a %2 == 0){
        if (a<0){
            println("$a is negative even number")
        }
        else if (a>0){
            println("$a is positive even number")
        }
        else{
            println("$a is zero")
        }
    }
    else if (a %2 != 0 ){
        if (a<0){
            println("$a is negative odd number")
        }
        else if (a>0){
            println("$a is positive odd number")
        }
        else{
            println("$a is zero")
        }
    }
    else{
        println("$a is zero")
    }
}

fun task6(){
    val a = 789
    if (a %2 == 0){
        if (a<100){
            println("$a even two-digit number")
        }
        else if (a<1000){
            if (a>99){
                println("$a even three-digit number")
            }
            else{
                println("error")
            }
        }
        else{
            println("error")
        }
    }
    else if(a %2 != 0){
        if (a<100){
            println("$a odd two-digit number")
        }
        else if (a<1000){
            if (a>99){
                println("$a odd three-digit number")
            }
            else{
                println("error")
            }
        }
        else{
            println("error")
        }
    }
}
