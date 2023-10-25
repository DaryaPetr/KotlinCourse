package lesson_14

open class Liner(
    val speed: Int = 30,
    val loadCapacity: Int = 400,
    val passengersCount: Int = 2000,
)

class Cargo(
    speed: Int = 20,
    loadCapacity: Int = 3000,
    passengersCount: Int = 100,
) : Liner(speed, loadCapacity, passengersCount)

class Icebreaker(
    speed: Int = 10,
    loadCapacity: Int = 100,
    passengersCount: Int = 60,
) : Liner(speed, loadCapacity, passengersCount) {

    fun breakIce() = println("Колет лёд")
}

fun main() {

    val liner = Liner()
    val cargo = Cargo()
    val icebreaker = Icebreaker()

}