fun main() {
    var a = 8
    var formula: Int = 4*a
    println("The first task")
    println ("Perimeter is: $formula")

    println("----------------------------")
    var b = 5
    var area: Int = b*b
    println("The second task")
    println ("Area is : $area")
    println("----------------------------")
    var c = 8
    var d = 9
    var area1: Int = c*d
    println("----------------------------")
    println("The #3 task")
    println("The area of rectangle: $area1")
    var perimeter: Int = 2*(c + d)
    println("The perimeter of rectangle: $perimeter")
    println("----------------------------")
    println("The #4 task")
    var p = 3.14
    var q = 6
    var circle: Double = q*p
    println("The diameter of the circle: $circle")
    println("----------------------------")
    println("The #5 task")
    var w = 8
    var value: Int  = w*w*w
    println("Value of cube: $value")
    var surface: Int = 6*w*w
    println("Surface of cube: $surface")
    println("----------------------------")
    println("The #6 task")
    var e = 8
    var r = 4
    var t = 6
    var va: Int = e*r*t
    var sa: Int  = 2*(e*r + e*t + r*t)
    println("The value of parallelepiped: $va")
    println("The surface area of parallelepiped: $sa")
    println("----------------------------")
    println("The #7 task")
    var R = 4
    var length: Double = 2*R*p
    var are: Double = p*R*R
    println("Length of circle: $length")
    println("Area of circle: $are")
    println("----------------------------")
    println("The #8 task")
    var i = 55.6
    var o = 66.8
    var arithmetic: Double = (i+o)/2
    println("arithmetic mean: $arithmetic")
    println("----------------------------")
    println("The #9 task")
    var s = 4
    var g = 5
    var geometric: Int = (s*g)
    println("sqrt($geometric:)" + Math.sqrt(geometric.toDouble()))
    println("----------------------------")
    println("The #10 task")
    var sum: Int = a+b
    var difference: Int = a-b
    var product: Int = a*b
    println("sum: $sum")
    println("difference: $difference")
    println("product: $product")
    println("sqrt($product:)" + Math.sqrt(product.toDouble()))
}