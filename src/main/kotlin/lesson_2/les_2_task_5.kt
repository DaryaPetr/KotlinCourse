package lesson_2

import kotlin.math.pow

fun main() {

    val term = 20
    val initialAmount = 70000
    val rate = 16.7

    val totalAmount = initialAmount * (1 + rate * 0.01).pow(term)
    println(String.format("%.3f", totalAmount))

}