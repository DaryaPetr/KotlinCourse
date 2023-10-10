package lesson_12

class Weather3(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val atmospherePressure: Int,
    val isRain: Boolean = false,
) {

    fun printData() {
        println("dayTemperature $dayTemperature, nightTemperature $nightTemperature, " +
                "atmospherePressure $atmospherePressure isRain $isRain,")
    }

}

fun main() {

    val threeDayWeather = mutableListOf<Weather3>()
    threeDayWeather.add(Weather3(10, 0, 700))
    threeDayWeather.add(Weather3(13, 0, 740, true))
    threeDayWeather.add(Weather3(19, 6, 755))
    for (day in threeDayWeather) day.printData()

}