package lesson_4

fun main() {

    val trainingNames = mutableListOf("Упражнения для мышц рук/пресса", "Упражнения для мышц ног/спины")
    val firstTypeList = listOf("Упражнения для мышц рук", "Упражнения для мышц пресса")
    val secondTypeList = listOf("Упражнения для мышц ног", "Упражнения для мышц спины")
    val trainingTypesLists = mutableListOf(firstTypeList, secondTypeList)
    val currentTrainingDay = 5
    val startType = "Упражнения для мышц рук/пресса"
    var startTypeNumber = 0
    trainingNames.forEach { training ->
        if (training.contains(startType))
            startTypeNumber = trainingNames.indexOf(training) + 1
    }

    var maxStringLength = -1

    for (trainingList in trainingTypesLists)
        for (training in trainingList)
            if (training.length > maxStringLength) maxStringLength = training.length


    for (trainingList in trainingTypesLists) {
        val trainingCount = trainingTypesLists.size
        val trainingDay = trainingTypesLists.indexOf(trainingList) % trainingCount + 1
        for (training in trainingList) {
            val result = (trainingDay == ((currentTrainingDay + startTypeNumber) % trainingCount + 1)).toString()
            val trainingStr = training + ':'
            println(String.format("%${-(maxStringLength + 1)}s $result", trainingStr))
        }
    }


}