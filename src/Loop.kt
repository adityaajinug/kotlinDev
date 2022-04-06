fun main() {
    println("=============== While Loop =====================")
    // While Loop
    val guestPerFamily = listOf(2, 4, 1, 3)

    var totalGuests = 0

    var i = 0
    while (i < guestPerFamily.size) {
        totalGuests += guestPerFamily[i]
        i++
    }
    println("Total Guest Count: $totalGuests")

    println()
    println("=============== For in Loop =====================")
    // For in Loop
    val names = listOf("Adit", "Hendi", "Dana", "Rendi")
    for (name in names) {
        //println(name)
        println("$name - Number of Char: ${name.length}")
    }

}