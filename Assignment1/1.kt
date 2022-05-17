package Assignment1

import kotlin.math.pow
import kotlin.math.abs

fun main(){
    val x = 2.0
    val p = 3.14
    println("#1")
    val y: Double = 3*x.pow(6)-6*x.pow(2)-7
    println("value of function: $y")
    println("#2")
    val y_1: Double = 4*(x-3).pow(6)-7*(x-3).pow(3)+2
    println("value of second function: $y_1")
    val deg: Double = 75.0
    val deg_to_rad: Double = (deg*p)/180
    println("#3")
    println("degree to radian value: $deg_to_rad")
    val rad: Double = 6.2
    val rad_to_deg: Double = (rad*180)/p
    println("radian to degree value: $rad_to_deg")
    val tf = 40
    val tc: Int = (tf-32)*5/9
    println("F to C: $tc")
    val tc_1 = 10
    val tf_1: Int = (tc_1*9/5)+32
    println("C to F: $tf_1")
    val boat = 7
    val still_water = 3
    val t_1 = 2
    val s = 20
    val t_2: Int = s/(boat-still_water)
    println("time against water: $t_2")
    val speed_1 = 2
    val speed_2 = 3
    val path = 5
    val time = 3
    val total: Int = abs((speed_1-speed_2))*time
    println("total path: $total")
    val t_total: Int = path-total
    println("end path: $t_total")
    val total_1: Int = (speed_1+speed_2)*time
    println("total_1 path: $total_1")
    val dif: Int = abs(path-total_1)
    println("difference: $dif")
    println("#10")
    val a = 1
    val b = 4
    val c = 4
    val d: Int = b*b-4*a*c
    println("sqrt($d: "+ Math.sqrt(d.toDouble()))
    val d1 = Math.sqrt(d.toDouble())
    if (d1 > 0){
        val x1: Double = (-b+d1)/2*a
        println("x1 root: $x1")
        val x2: Double = (-b-d1)/2*a
        println("x2 root: $x2")
    }
   else if(d1<0){
       println("The discriminant is less than 0, can not work")
    }
    else{
        var x3: Int = (-b)/2*a
        println("x root is: $x3")
    }
}