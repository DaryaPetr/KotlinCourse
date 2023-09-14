package lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    checkGood(42, 120)
    checkGood(20, 80)
    checkGood(50, 100)

}

fun checkGood(weight: Int, volume: Int) =
    println("соответствует категории 'Average': " +
            "${weight <= MAX_WEIGHT && weight >= MIN_WEIGHT && volume <= MAX_VOLUME}")
