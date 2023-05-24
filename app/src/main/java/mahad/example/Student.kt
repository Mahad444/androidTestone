package mahad.example

class Student (var name:String = "", var marks:Int = 0){
//    var name : String = name
//    var marks = marks

    var nameOfTheClass : String = ""

    constructor(nameOfTheClass: String):this(){
        this.nameOfTheClass = nameOfTheClass
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
    println("Student $name has archieved $marks marks in the exam and he is in class $nameOfTheClass")
    }
}