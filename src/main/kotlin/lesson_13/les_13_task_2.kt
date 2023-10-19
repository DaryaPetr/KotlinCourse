package lesson_13

class Contact132(
    val name: String,
    val phone: Long,
    val company: String?,
) {

    fun printContact132() =
        println("Имя: $name. Номер: $phone. Компания: ${if (company != null) company else "не указано"}")

}

fun main() {

    var contact = Contact132("Ростислав", 89123456789, null)
    contact.printContact132()
    contact = Contact132("Ростислав", 89123456789, "Reddit")
    contact.printContact132()

}