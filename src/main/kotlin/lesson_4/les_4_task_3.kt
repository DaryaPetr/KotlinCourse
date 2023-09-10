package lesson_4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "не зима"

fun main() {

    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunny == IS_SUNNY && isTentOpen == IS_TENT_OPEN &&
                    airHumidity == AIR_HUMIDITY && season == SEASON}")

}