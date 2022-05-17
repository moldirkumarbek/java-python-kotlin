fun main(){
    println("Tasks for offline class")
    println("#1")
    val a = 5
    val b = 6
    val sum: Int = a+b
    val difference: Int = a-b
    val product: Int = a*b
    println("sum: $sum")
    println("difference: $difference")
    println("product: $product")
    println("sqrt of $product: " + Math.sqrt(product.toDouble()))

    println("#2")
    val hypotenuse: Int = a*a + b*b
    val new = Math.sqrt(hypotenuse.toDouble())
    val perimeter: Double = a + b + new

    println("hypotenuse : $new" )
    println("perimeter: $perimeter")

    println("#3")
    val p = 3.14
    val r1 = 7
    val r2 = 3
    val S1: Double = p * r1 * r1
    val S2: Double = p * r2 * r2
    val S3: Double = S1 - S2
    println("The area of biggest circle is $S1 , the second circle is $S2 , and area of ring is $S3 ")

    println("#4")
    val length = 10
    val r: Double = length/(2*p)
    val s: Double = p*r*r
    println("Radios of circle is $r\nArea of circle is $s ")

    println("#5")
    val area = 60
    val R1: Double = area/p
    val R2 = Math.sqrt(R1.toDouble())
    val l: Double = 2*p*R2
    val D: Double = 2*R2
    println("The diameter is $D\nThe length is $l")
}