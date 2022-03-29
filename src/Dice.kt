fun main() {
    val myFirstDice = Dice(6)
//    val diceRoll = myFirstDice.roll()
//    println(myFirstDice.sides)

    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")
//    myFirstDice.roll()

//    myFirstDice.sides = 20
//    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${myFirstDice.roll()}")
}

class Dice (val numSides: Int) {
//    var sides = 6
    fun roll() : Int {
        return (1..numSides).random()
//        println(randomNumber)

    }

}
