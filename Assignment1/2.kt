package Assignment1

fun main() {
    task2_1(3500)
    println()
    task2_2(681652)
    println()
    task2_3(681652)
    println()
    task2_4(681652)
    println()
    task2_5(681652)
    println()
    task2_6(681652)
    println()
    task2_7(30)
    println()
    task2_8(20)
    println()
    task2_9(60)
}

fun task2_1 (n : Int){
    println(n/1000)
}
fun task2_2 (n : Int){
    println("num of full min = " + n/60)
}
fun task2_3 ( n : Int){
    println("num of full hour = " + n/60/60)
}
fun task2_4 (n : Int){
    println("num of last of seconds = " + n%60)
}
fun task2_5 (n : Int){
    println(n%3600)
}
fun task2_6 (n : Int){
    println( ((n%3600)/60))
}
fun task2_7 (nday:Int){
    val day=((nday+4)%7)
    println(day)
}

fun task2_8 (nday:Int){
    val day=((nday+4)%7)
    if(day!=0){
        println(day-1)
    }
    else {
        println(6)
    }
}
fun task2_9 (nday:Int){
    val day=((nday+1)%7)
    if(day==0){
        println(7)
    }
    else {
        println(day)
    }
}