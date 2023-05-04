fun main (){
//    pairs and Triples
    val coordinates:Pair<Int,Double> = Pair(2,5.6)

    println("The coordinates are $coordinates")

    val coodinatesTwo = Pair(3,"mahad")   //type interface

    println(coodinatesTwo)

    val coodinatesThree = 3 to "MuhibulHaqqu"  //Using the to operator

    println(coodinatesThree)

    //checking coodinates of ecah specificly

    println("this name is ${coodinatesThree.second}")

    val wayab :Triple <Int,String,Double> = Triple(2,"Paka" , 2.4)

    println(wayab)
    var wayab2 = Triple (4,"Hudheifa" , "khadija")

    println("the first one is ${wayab2.third}")



}
