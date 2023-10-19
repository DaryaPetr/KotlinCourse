package lesson_12

class Weather {
    var dayTemperature = 10
    var nightTemperature = 1
    var isRain = false
    var atmospherePressure = 700

    fun printData() {
        println("dayTemperature $dayTemperature, nightTemperature $nightTemperature, " +
                "isRain $isRain, atmospherePressure $atmospherePressure")
    }
}

fun main() {

    val weather1 = Weather()
    val weather2 = Weather()
    weather1.printData()
    weather2.printData()
    weather1.dayTemperature = 20
    weather1.atmospherePressure = 1
    weather2.isRain = true
    weather2.atmospherePressure = 7000
    weather1.printData()
    weather2.printData()

}