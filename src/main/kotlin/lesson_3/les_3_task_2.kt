package lesson_3

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

fun main() {

    val dateFormatter: DateTimeFormatter =  DateTimeFormatter.ofPattern("dd.MM.yyyy")

    val birthday = LocalDate.parse("01.01.2000", dateFormatter)

    val surname = mutableMapOf(birthday to "Андреева")
    val name = mutableMapOf(birthday to "Татьяна")
    val patronymic = mutableMapOf(birthday to "Сергеевна")
    val personData = listOf(surname, name, patronymic)

    surname.put(LocalDate.parse("06.04.2022", dateFormatter), "Сидорова")

    printFullNameAndAge(birthday, personData, LocalDate.parse("02.01.2020", dateFormatter))
    printFullNameAndAge(birthday, personData, LocalDate.parse("01.08.2022", dateFormatter))

}

fun printFullNameAndAge(birth: LocalDate, personData: List<MutableMap<LocalDate, String>>,
                        requestedDate: LocalDate) {
    var fullName = ""
    for (item in personData){
        fullName += "${getData(item, requestedDate)} "
    }
    fullName = fullName.dropLast(1)
    val period = Period.between(birth, requestedDate)
    val age = period.years
    println("$fullName, $age")
}

fun getData(dataMap: MutableMap<LocalDate, String>, requestedDate: LocalDate): String {
    var name = ""
    for ((date, personName) in dataMap)
        if (date <= requestedDate) name = personName else break
    return name
}
