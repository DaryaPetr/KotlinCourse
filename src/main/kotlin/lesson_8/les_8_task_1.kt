package lesson_8

fun main() {

    val adViewCount = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90)
    var count = 0
    var sum = 0
    for (i in adViewCount.reversed()) {
        sum += i
        if (++count == 7) break
    }
    println("Количесвто просмотров рекламы за неделю: $sum")
}