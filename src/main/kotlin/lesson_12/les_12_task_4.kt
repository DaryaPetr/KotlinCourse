package lesson_12

class Weather4(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val atmospherePressure: Int,
    val isRain: Boolean = false,
) {

    init {
        printData()
    }

    fun printData() {
        println("dayTemperature $dayTemperature, nightTemperature $nightTemperature, " +
                "atmospherePressure $atmospherePressure isRain $isRain,")
    }

}

fun main() {

    val threeDayWeather = mutableListOf<Weather4>()
    threeDayWeather.add(Weather4(10, 0, 700))
    threeDayWeather.add(Weather4(13, 0, 740, true))
    threeDayWeather.add(Weather4(19, 6, 755))

}