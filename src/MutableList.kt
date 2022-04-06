fun main() {
    val entrees = mutableListOf<String>()
//    val entrees: MutableList<String> = mutableListOf()


    // Menambahkan
    println("=========== MENAMBAHKAN DATA ==============")
    println("Add mie: ${entrees.add("Mie")}")
    println("Entrees: $entrees")
    println("Add bakso: ${entrees.add("Bakso")}")
    println("Entrees: $entrees")

    val moreItem = listOf("Lumpia", "Soto", "Rawon")
    println("Add list: ${entrees.addAll(moreItem)}")
    println("Entrees: $entrees")

    // Menghapus
    println("=========== MENGHAPUS DATA ==============")
    println("Remove bakso: ${entrees.remove("Bakso")}")
    println("Entrees: $entrees")
    println("Remove item dosen't exist: ${entrees.remove("Nasi")}")
    println("Entrees: $entrees")
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")
    entrees.clear()
    println("Entrees: $entrees")
    println("Empty? ${entrees.isEmpty()}")



}