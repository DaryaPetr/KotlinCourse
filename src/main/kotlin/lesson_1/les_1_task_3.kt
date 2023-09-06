package lesson_1

fun main() {

    val launchTime = "09:07"
    val landingTime = "10:55"
    val year = 1961
    var hour = launchTime.subSequence(0,2)
    var minute = launchTime.subSequence(3,5)
    println("Взлёт:\n" +
            "$year\n" +
            "$hour\n" +
            "$minute")
    hour = landingTime.subSequence(0,2)
    minute = landingTime.subSequence(3,5)
    println("Посадка: $hour:$minute")
}