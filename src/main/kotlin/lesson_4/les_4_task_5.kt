package lesson_4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val IS_DAMAGED = false
const val MIN_PROVISION_BOXES_COUNT = 51
const val IS_WEATHER_FAVORABLE = true

fun main() {

    val isDamaged = readln().toBoolean()
    val crewCount = readln().toInt()
    val provisionBoxesCount = readln().toInt()
    val isWeatherFavorable = readln().toBoolean()

    val result = if ((provisionBoxesCount >= MIN_PROVISION_BOXES_COUNT) &&
        (isDamaged == IS_DAMAGED && crewCount in MIN_CREW_COUNT..MAX_CREW_COUNT &&
                (isWeatherFavorable == IS_WEATHER_FAVORABLE || isWeatherFavorable != IS_WEATHER_FAVORABLE) ||
                crewCount == MAX_CREW_COUNT && isWeatherFavorable == IS_WEATHER_FAVORABLE))
        "Корабль может отправиться в плавание"
    else "Корабль не может отправиться в плавание"

    println(result)
}