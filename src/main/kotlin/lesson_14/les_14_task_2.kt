package lesson_14

open class Liner2(
    val speed: Int = 30,
    val loadCapacity: Int = 400,
    val passengersCount: Int = 2000,
) {

    open fun loading() = println("Выдвигается горизонтальный трап со шкафута")

    open fun printProperties() {
        println("Скорость: $speed. Грузоподъёмность: $loadCapacity. Вместительность: $passengersCount")
    }

}

class Cargo2(
    speed: Int = 20,
    loadCapacity: Int = 3000,
    passengersCount: Int = 100,
) : Liner2(speed, loadCapacity, passengersCount) {

    override fun loading() = println("Активируется погрузочный кран")

    override fun printProperties() {
        super.printProperties()
    }

}

class Icebreaker2(
    speed: Int = 10,
    loadCapacity: Int = 100,
    passengersCount: Int = 60,
) : Liner2(speed, loadCapacity, passengersCount) {

    fun breakIce() = println("Колет лёд")

    override fun loading() = println("Открываются ворота со стороны кормы")

    override fun printProperties() {
        super.printProperties()
    }

}

fun main() {

    val liner = Liner2()
    val cargo = Cargo2()
    val icebreaker = Icebreaker2()

}