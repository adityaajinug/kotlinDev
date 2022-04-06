fun main() {
    val colors = listOf("Green", "Orange", "Blue")

//    colors.add("purple")
//    colors[0] = "yellow"

    println("Reserved list: ${colors.reversed()}")
    println("List: $colors")

    println("Sorted list: ${colors.sorted()}")

    val oddNumbers = listOf(4,8,2,5,9,7)
    println("Numbers Sorted list: ${oddNumbers.sorted()}")
}