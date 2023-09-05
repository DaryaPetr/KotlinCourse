package lesson_1

fun main() {
    val second = 6480
    val secondRemainder = second % 60
    val minute = second / 60 % 60
    val minuteRemainder = minute % (60 * 60)
    val hour = second / 60 / 60
    hour.toString()
    minuteRemainder.toString()
    secondRemainder.toString()
    println(String.format("%02d:%02d:%02d", hour, minuteRemainder, secondRemainder))
}