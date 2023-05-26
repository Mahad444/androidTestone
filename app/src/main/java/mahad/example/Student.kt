package mahad.example

class Student (var name:String = "", var marks:Int = 0){
    var parcentage
//    GETTERS AND SETTERS
    get()  =  (marks *100 )/100

        set(value) {
            marks = value * 2
        }




    init {
//        println("Init Block Student class $name class $nameOfTheClass and $ marks")
    }
//  var nameOfTheClass = "8B"  we cannot declare the accessed variable before the init block like this
    init {
//        println("Done Printing")
    }


//    Methods
    fun printMarks(){
    println("Student $name has archieved $marks marks in the exam and he is in class")
    }
    fun prinPercentage () {
        println("Student $name has archived $parcentage% in general")
    }
}