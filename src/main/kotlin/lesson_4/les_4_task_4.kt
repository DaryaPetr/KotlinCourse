package lesson_4

fun main() {

    val trainingNames = mutableListOf("Упражнения для мышц рук/пресса", "Упражнения для мышц ног/спины")
    val firstTypeList = listOf("Упражнения для мышц рук", "Упражнения для мышц пресса")
    val secondTypeList = listOf("Упражнения для мышц ног", "Упражнения для мышц спины")
    val trainingTypesLists = mutableListOf(firstTypeList, secondTypeList)
    val currentTrainingDay = 5
    val startType = "Упражнения для мышц рук/пресса"
    val startTypeNumber = trainingNames.indexOf(startType) + 1

    val maxStringLength = trainingTypesLists.flatten().maxByOrNull { it.length }?.length
        ?: return

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