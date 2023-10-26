package lesson_13

class Contact135(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {

    fun printContact135() =
        println("Имя: $name. Номер: $phone. Компания: ${if (company != null) company else "не указано"}")

}

fun main() {

    print("Введите номер телефона: ")
    val phone = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println(e)
    }

}