package lesson_12

import kotlin.random.Random

class Weather5(
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

    val monthWeather = mutableListOf<Weather5>()
    val dayTemperatures = mutableListOf<Int>()
    val nightTemperatures = mutableListOf<Int>()
    val rainDays = mutableListOf<Weather5>()

    for (day in 1..30) {
        monthWeather.add(
            Weather5(generateDayTemp(), generateNightTemp(), generateAtmosPress(), generateRain()))
    }

    monthWeather.forEach {
        dayTemperatures.add(it.dayTemperature)
        nightTemperatures.add(it.nightTemperature)
        if (it.isRain) rainDays.add(it)
    }

    println("\nСреднее значение дневной температуры: %.1f".format(dayTemperatures.average()))
    println("Среднее значение ночной температуры: %.1f".format(nightTemperatures.average()))
    println("Количество дней с осадками: ${rainDays.size}")

}

fun generateDayTemp() = (5..30).random()

fun generateNightTemp() = (-10..20).random()

fun generateAtmosPress() = (740..760).random()

fun generateRain() = Random.nextBoolean()