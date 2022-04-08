package lab2

import kotlin.math.*

fun g(x: Double): Double {
    return sqrt(x + sqrt(x + sqrt(x + sin(x).pow(2))))
}

fun p(x: Double): Double {
    return (cos(x * x + ln(1.0 + exp(sqrt(x)))))
}

fun f(g: Double, p: Double): Double {
    return g / p
}


fun main() {
    println("Hello There,Please compute ,my  formula  with x ")
    val x = readLine().toString().toDouble()

    val y = f(g(x), p(x))
    println("General, your result is $y")
}
