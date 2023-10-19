package lesson_12

class Weather2(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _isRain: Boolean,
    _atmospherePressure: Int,
) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isRain: Boolean = _isRain
    var atmospherePressure = _atmospherePressure

    fun printData() {
        println("dayTemperature $dayTemperature, nightTemperature $nightTemperature, " +
                "isRain $isRain, atmospherePressure $atmospherePressure")
    }
}

fun main() {

    val weather1 = Weather2(20, -2, false, 750)
    val weather2 = Weather2(13, 0, true, 740)
    val weather3 = Weather2(19, 6, true, 755)
    weather1.printData()
    weather2.printData()
    weather3.printData()

}