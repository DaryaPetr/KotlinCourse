package lesson_2

fun main() {

    val departureTime = "9:39"
    val path = 457
    val departureHour = departureTime.substringBefore(':').toInt()
    val departureMinute = departureTime.substringAfter(':').toInt()

    var pathHour = path / 60
    val pathMinute = path % 60

    var arrivalMinute = departureMinute + pathMinute
    if (arrivalMinute >= 60) {
        arrivalMinute %= 60
        pathHour++
    }
    val arrivalHour = (departureHour + pathHour) % 24
    println("Поезд прибывает в $arrivalHour:$arrivalMinute")

}