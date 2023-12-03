package lesson_14

import kotlin.math.PI

const val BLACK = "BLACK"
const val WHITE = "WHITE"

abstract class Figure{

    abstract val color: String
    abstract fun perimeter(): Double
    abstract fun area(): Double
}

class Circle(
    override val color: String,
    val radius: Double,
) : Figure() {

    override fun perimeter() = 2 * PI * radius

    override fun area() = PI * radius * radius

}

class Rectangle(
    override val color: String,
    val width: Double,
    val height: Double,
): Figure() {

    override fun perimeter() = (width + height) * 2

    override fun area() = width * height

}

fun main() {

    val figures = listOf<Figure>(
        Circle("Black", 3.0),
        Circle("White", 5.0),
        Rectangle("White", 2.0, 4.0),
        Rectangle("Black", 1.0, 1.0),
        Rectangle("White", 1.0, 4.0),
    )

    val (blackPerimeterSum, whiteAreaSum) = computeSum(figures)

    println("Сумма периметров всех чёрных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteAreaSum")

}

fun computeSum(figures: List<Figure>): Pair<Double, Double> {
    val blackPerimeterSum = figures
        .filter { it.color.uppercase() == BLACK }
        .sumOf { it.perimeter() }
    val whiteAreaSum = figures
        .filter { it.color.uppercase() == WHITE }
        .sumOf { it.area() }
    return (blackPerimeterSum to whiteAreaSum)
}