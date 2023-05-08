package muhib.com

//import kotlin.math.PI

abstract class Shape(open val width: Double) {
    abstract fun area(): Double
}

class Square(override val width: Double) : Shape(width) {
    override fun area(): Double {
        return width * width
    }
}

class Circle(override val width: Double) : Shape(width) {
    override fun area(): Double {
        return 3.142 * width * width
    }
}

fun main() {
    // User input for square width
    print("Enter the width of the square: ")
    val squareWidth = readLine()?.toDoubleOrNull()

    // User input for circle width
    print("Enter the width of the circle: ")
    val circleWidth = readLine()?.toDoubleOrNull()

    if (squareWidth != null && circleWidth != null) {
        val square = Square(squareWidth)
        val circle = Circle(circleWidth)

        val squareArea = square.area()
        val circleArea = circle.area()

        println("Square area: $squareArea")
        println("Circle area: $circleArea")
    } else {
        println("Invalid input. Please enter valid numeric values.")
    }
}
