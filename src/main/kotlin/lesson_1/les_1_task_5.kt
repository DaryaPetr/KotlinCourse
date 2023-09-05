package lesson_1

fun main() {
    var second = 108 * 60
    var minute = second / 60
    val hour = second / 60 / 60
    minute -= hour * 60
    second = second - hour * 60 * 60 - minute * 60
    hour.toString()
    minute.toString()
    second.toString()
    println(String.format("%02d:%02d:%02d", hour, minute, second))
}