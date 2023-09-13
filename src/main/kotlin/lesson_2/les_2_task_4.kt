package lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2

    val bonusCO = (crystalOre * buff).toInt()
    val bonusIO = (ironOre * buff).toInt()

    println("Бонусная кристаллическая руда: $bonusCO\n" +
            "Бонусная железная руда: $bonusIO")

}