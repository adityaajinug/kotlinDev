fun main() {
//    val age = 7 * 365
//    val name = "Aditya"
//
//    println("Happy Birthday, ${name}")
//
//    println("  ,,,,  ")
//    println("  ||||  ")
//    println(" ====== ")
//    println("@@@@@@@@")
//
//    println(" ")
//
//    println("You already ${age}!")
//    println("${age} is the best age to celebrate ")

//    val border = "`-._,-'"
//    val reapeatBorder = 4
//    printBorder(border, reapeatBorder)
//    println("Happy Birthday, Aditya")
//    printBorder(border, reapeatBorder)

    val age = 4
    val layers = 6
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)



}
//fun printBorder(border:String, reapeatBorder:Int) {
//    repeat(reapeatBorder)
//    {
//        print(border)
//    }
//    println()
//}

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println()
    print(" ")
    repeat(age) {
        print("|")
    }
    println()

}
fun printCakeTop(age:Int) {
    repeat( age + 2) {
        print("=")
    }
    println()
}
fun printCakeBottom(age: Int, layers:Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }


}

