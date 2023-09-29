package lesson_8

const val WEEK_DAYS_COUNT = 7

fun main() {

    val adViewCount = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    var count = 0
    var sum = 0
    for (i in adViewCount.reversed()) {
        sum += i
        if (++count == WEEK_DAYS_COUNT) break
    }
    println("Количество просмотров рекламы за неделю: $sum")
}