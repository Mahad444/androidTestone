//learning about null and none-nullables

fun main (){
    val wayab : Int? = null

    var fishFoodTreats = 6

    if (fishFoodTreats != null){
        fishFoodTreats = fishFoodTreats.dec()
    }

    var fishFoodTreat = 7
    fishFoodTreat = fishFoodTreat?.dec()!!

var fishTreat = 6
//    fishTreat = fishTreat?.dec()!! ? : 0
}