package lesson_4

const val TABLES = 13

fun main() {

    val todayReservedTables = 13
    val tomorrowReservedTables = 9

    println("Доступность столиков на сегодня: ${todayReservedTables < TABLES}\n" +
            "Доступность столиков на завтра: ${tomorrowReservedTables < TABLES}")

}