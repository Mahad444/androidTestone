fun main(args: Array<String>){
    println("Hello World")

    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)


    val temperature = 10
    val isHot = if (temperature > 50) true else false

    println(isHot)

    //determing the temprature for the fish of its too hot or Ok for the water
    val joto = 25
    val message = "the water temprature is ${if (joto > 50 )"too warm" else "OK"}"
    println(message)
}