class Student(val name: String, val rollNumber: Int) {
    fun introduce() {
        println("Hi, I'm $name and my roll number is $rollNumber.")
    }
}

fun main() {
    val s1 = Student("Soumyadeep Das", 101)
    val s2 = Student("Rahul Sharma", 102)
    s1.introduce()
    s2.introduce()
}