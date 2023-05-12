fun main(){
//    if statements
    val numberOfFish = 50
    val numberofPlants = 23

    if (numberOfFish > numberofPlants){
        println("Healthy Ratio")
    }
    else {
        println("Unhealthy Ratio")
    }

//    writing using in
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }

//    using if elseif and else
    if (numberOfFish == 0){
        println("No fish in the tank")
    }
    else if (numberOfFish < 40){
        println("Got Fish!")
    }
    else {
        println("A lot Of Fish Is Present in the tank")
    }

//using When
    when (numberOfFish){
        0 -> println("Hakuna Samaki kwenye bwawa")
        in (1..39) -> println("kuna samaki!")
        else -> println("Kuna Samaki Wengi Sana ")
    }

}

