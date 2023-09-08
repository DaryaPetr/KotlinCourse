package lesson_4

fun main() {

    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunny && isTentOpen && airHumidity == 20 && season != "зима"}")

}