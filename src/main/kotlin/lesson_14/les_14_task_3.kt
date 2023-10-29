package lesson_14

import kotlin.math.PI

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

    val figures = mutableListOf<Figure>(
        Circle("Black", 3.0),
        Circle("White", 5.0),
        Rectangle("White", 2.0, 4.0),
        Rectangle("Black", 1.0, 1.0),
        Rectangle("White", 1.0, 4.0),
    )

    println("Сумма периметров всех чёрных фигур: ${blackPerimeterSum(figures)}")
    println("Сумма площадей всех белых фигур: ${whiteAreaSum(figures)}")

}

fun blackPerimeterSum(figures: MutableList<Figure>): Double {
    var sum = 0.0
    figures.forEach { figure ->
        if (figure.color == "Black")
            sum += figure.perimeter()
    }
    return  sum
}

fun whiteAreaSum(figures: MutableList<Figure>): Double {
    var sum = 0.0
    figures.forEach { figure ->
        if (figure.color == "White")
            sum += figure.area()
    }
    return  sum
}