package lesson_2

fun main() {
    val employeeCount = 50
    val internCount = 20
    val employeeSalary = 30000
    val internSalary = 20000

    val employeePayment = employeeCount * employeeSalary
    val internPayment = internCount * internSalary
    val totalPayment = employeePayment + internPayment
    val totalWorkers = employeeCount + internCount
    val averagePayment = totalPayment * 1.0 / totalWorkers

    println("Расходы на выплату зарплаты постоянных сотрудников: $employeePayment\n" +
            "Общие расходы по ЗП после прихода стажеров: $totalPayment\n" +
            "Средняя ЗП одного сотрудника после устройства стажеров: " +
            String.format("%.3f", averagePayment))

}