fun main() {
    val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
//    println(myFirstDice.sides)
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}")
//    myFirstDice.roll()
}

class Dice {
    var sides = 6
    fun roll() : Int {
        val randomNumber = (1..6).random()
        println(randomNumber)
        return randomNumber
    }

}
