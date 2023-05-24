package mahad.example

fun main () {

    val student = Student(marks = 50,name ="Wayab") // this marks specifies the argument if no order is followed

//    var studee = Student(nameOfTheClass = "7F")
//    studee.printMarks()

    student.printMarks()
    student.parcentage =7
    student.prinPercentage()

    val student1 = Student()


    student1.name = "Arafat"
    student1.marks = 80
    student1.printMarks()


}