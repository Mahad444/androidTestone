fun main () {
    val school = listOf("Jamhuri", "Rabbani", "Ashrafia")
    println(school)

    val myList = mutableListOf("Raila", "Ruto", "Uhuru")
    myList.remove("Ruto")
    println(myList)


    val schools = arrayOf("Moi Gorls", "ST.Gorges", "Maarif Girls")
    println(java.util.Arrays.toString(schools))


    val mix = arrayOf("wayab",5 )
    println(java.util.Arrays.toString(mix))

    val numbers = intArrayOf(6,4,3,2,1)
    println(java.util.Arrays.toString(numbers))


    val namba = intArrayOf(1,2,3)
    val namba2 = intArrayOf(4,5,6)
    val combii = namba + namba2
    println(combii[5])

    val numberss = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(java.util.Arrays.toString(numberss), oceans, "salmon")
    println(oddList)

    val multi = Array (6){it * 2}
    println(java.util.Arrays.toString(multi))

    val shule = arrayOf("shartk","whale","fish")

    for (element in shule){
        println(element + " ")
    }

    for ((index, element) in shule.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) println(i)

    println("*******")

    for (i in 5 downTo 1) println(i)


    for (i in 3..6 step 2) println(i)

    for (i in 'a'..'z') print(i)

//    loops
    var bubbles = 0
    while (bubbles < 50 ){
        println("$bubbles bubbles in the water\n")
        bubbles ++
    }

    do {
        bubbles --
    }
        while (bubbles > 50)
        println("$bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}
//end
