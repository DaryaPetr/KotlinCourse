package lesson_2

fun main() {

    val englishMarks = listOf(3, 4, 3, 5)
    val studentCount = 4
    val marksSum = englishMarks.fold(0) { currentValue, result -> result + currentValue }
    val averageMark = marksSum * 1.0 / studentCount
    println(averageMark)

}