package lesson_13

const val SAFE_WORLD = "СТОП"

class Contact134(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {

    fun printContact134() =
        println("Имя: $name. Номер: $phone. Компания: ${if (company != null) company else "не указано"}")

}

fun main() {

    val contacts = mutableListOf<Contact134>()

    do {
        println("Добавление нового контакта")
        print("Введите имя: ")
        val name = readln()
        print("Введите номер телефона: ")
        val phone = readln().toLongOrNull()
        if (phone != null) {
            print("Введите название компании или нажмите Enter, чтобы пропустить поле: ")
            var company = readlnOrNull()
            if (company == "") company = null
            contacts.add(Contact134(name, phone, company))
        } else
            println("Отсутствует номер телефона. Данный контакт не будет добавлен")
        println("Введите \"Стоп\", чтобы завершить добавление контактов")
        val safeWord = readln()
    } while (safeWord.uppercase() != SAFE_WORLD)

    contacts.forEach {
        it.printContact134()
    }
}