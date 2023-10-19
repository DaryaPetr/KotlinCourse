package lesson_13

class Contact133(
    val name: String,
    val phone: Long,
    val company: String?,
) {

    fun printContact132() =
        println("Имя: $name. Номер: $phone. Компания: ${if (company != null) company else "не указано"}")

}

fun main() {

    val contacts = mutableListOf(
        Contact133("First", 89123456789, null),
        Contact133("Second", 89342419111, "company1"),
        Contact133("Third", 89342420142, null),
        Contact133("Forth", 89342502354, "null"),
        Contact133("Fifth", 89324532032, "company2")
    )

    contacts.forEach {
        if (it.company != null) println(it.company)
    }

}