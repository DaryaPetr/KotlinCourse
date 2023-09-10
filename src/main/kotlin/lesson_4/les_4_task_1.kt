package lesson_4

const val TABLES = 13

fun main() {

    var todayReservedTables = 13
    var tomorrowReservedTables = 13 - 4

    println("Доступность столиков на сегодня: ${todayReservedTables < TABLES}\n" +
            "Доступность столиков на завтра: ${tomorrowReservedTables < TABLES}")

}