open class Item(val name: String, val price:Int)

class Mie : Item("Mie", 10) {
    override fun toString(): String {
        return name
    }
}
class Sayur(vararg val tambahan:String) : Item("Sayur", 5) {
    override fun toString(): String {
        if(tambahan.isEmpty()) {
            return "$name Dipilihkan penjual"
        } else {
            return name + " " + tambahan.joinToString()
        }
    }
}
class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()
    fun addItem(newItem:Item) {
        itemList.add(newItem)


    }
    fun addAll(newItem: List<Item>) {
        itemList.addAll(newItem)

    }
    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: Rp.${item.price}")
            total += item.price
        }
        println("Total: Rp.${total}")

    }
}

fun main() {
    val order1 =  Order(1)
    order1.addItem(Mie())
    order1.print()

    val order2 =  Order(2)
    order2.addItem(Mie())
    order2.addItem(Sayur())
    order2.print()

    println()
//
//    val mie = Mie()
//    val sayur = Sayur("Wortel", "Bawang Goreng", "Garam")
//    val sayur2 = Sayur()
//    println(mie)
//    println(sayur)
//    println(sayur2)

    val order3 = Order(3)
    val item = listOf(Mie(), Sayur("Wortel", "Bawang Goreng", "Garam"))
    order3.addAll(item)
    order3.print()
}