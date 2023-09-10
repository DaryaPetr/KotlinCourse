package lesson_3

fun main() {
    val move = "D2-D4;0"
    var regex = """\W""".toRegex()
    regex = """[^A-Z0-9]""".toRegex()
    regex = """[-;]""".toRegex()
    val list = move.split(regex)
    val from = list[0]
    val to = list[1]
    val moveNumber = list[2]
    println(from)
    println(to)
    println(moveNumber)
}