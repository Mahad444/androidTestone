
import java.util.*

fun feedTheFish(){
    val day = randoDay()
    val food = fishFood(day)
    println("Today is $day and the fish eats $food")
}


//making random day function

fun randoDay(): String {
    val week = arrayOf("Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday")
    return  week[Random().nextInt(week.size)]

}

//creating if statements using when
fun fishFood (day:String):String{
    var food =""
    when(day) {
        "Monday"-> "flakes"
//        "Tuesday"-> food ="pelletes"
        "Wednesday" ->  "redworms"
        "Thursday" ->  "granules"
        "Friday" ->  "mosqutoes"
//        "Saturday" -> food = "lettuce"
        "Sunday" ->  "plankton"
        else -> "nothing"
    }
    return  food

}


fun main(args:Array<String>){
    feedTheFish()
}

