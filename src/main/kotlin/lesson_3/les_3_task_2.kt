package lesson_3

fun main() {

    val surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"

    val surnameChangeAge = 22
    val newSurname = "Сидорова"

    var age = 20
    println("${computeSurname(surname, newSurname, surnameChangeAge, age)} $name $patronymic, $age")
    age = 22
    println("${computeSurname(surname, newSurname, surnameChangeAge, age)} $name $patronymic, $age")
}

fun computeSurname(surname: String, newSurname: String,
                   surnameChangeAge: Int, age: Int) =
    if (age < surnameChangeAge) surname else newSurname