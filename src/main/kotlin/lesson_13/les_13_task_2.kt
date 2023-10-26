package lesson_13

class Contact132(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {

    fun printContact132() =
        println("Имя: $name. Номер: $phone. Компания: ${ company ?: "не указано"}")

}

fun main() {

    var contact = Contact132("Ростислав", 89123456789)
    contact.printContact132()
    contact = Contact132("Ростислав", 89123456789, "Reddit")
    contact.printContact132()

}