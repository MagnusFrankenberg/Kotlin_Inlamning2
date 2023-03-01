package TomteHierarki


/*
Tomtarna på Nordpolen har en strikt chefs-hierarki
Högsta chefen för allt är "Tomten"
Under "Tomten" jobbar "Glader" och "Butter"
Under "Glader" jobbar "Tröger", "Trötter"och "Blyger"
Under "Butter" jobbar "Rådjuret", "Nyckelpigan", "Haren" och "Räven"
Under "Trötter" jobbar "Skumtomten"
Under "Skumtomten" jobbar "Dammråttan"
Under "Räven" jobbar "Gråsuggan" och "Myran"
Under "Myran" jobbar "Bladlusen"
Er uppgift är att illustrera tomtens arbetshierarki i en lämplig datastruktur.
(Det finns flera tänkbara datastrukturer här)
Skriv sedan en funktion där man anger ett namn på tomten eller någon av hens underhuggare som
inparameter.
Funktionen listar sedan namnen på alla underlydandesom en given person har
Expempel: Du anger "Trötter" och får som svar ["Skumtomten", "Dammråttan"]"
För att bli godkänd på uppgiften måste du använda rekursion.
 */

class Elf(val name: String) {
    val children = mutableListOf<Elf>()

    fun add(child: Elf){
        children.add(child)
    }
}

class TomteHierarki {

    val Tomten = listOf<String>("Glader", "Butter")
    val Glader = listOf<String>("Tröger", "Trötter", "Blyger")
    val Butter = listOf<String>("Rådjuret", "Nyckelpigan", "Haren", "Räven")
    val Trötter = listOf<String>("Skumtomten")
    val Skumtomten = listOf<String>("Dammråttan")
    val Räven = listOf<String>("Gråsuggan", "Myran")
    val Myran = listOf<String>("Bladlusen")

    val parentToChildrenMap = mapOf(
        "Tomten" to Tomten, "Glader" to Glader, "Butter" to Butter, "Trötter" to Trötter,
        "Skumtomten" to Skumtomten, "Räven" to Räven, "Myran" to Myran
    )

    val root = Elf("Tomten")
    var currentElf = root



    fun createTree() {
        for ((parent, children) in parentToChildrenMap) {
            if (currentElf.name.equals(parent)) {
                for (name in children) {
                    currentElf.add(Elf(name))
                }
                for (elf in currentElf.children) {
                    currentElf = elf
                    createTree()
                }
            }
        }
        currentElf = root
    }

    fun findAllSubordinates(bossName:String):MutableList<String> {
        val allSubordinates = mutableListOf<String>()
        var currentElf = root

        fun findSubordinates(bossName: String) {
            if (currentElf.name.equals(bossName)) {
                currentElf.children.forEach { elf -> allSubordinates.add(elf.name) }

                currentElf.children.forEach { elf ->
                    currentElf = elf
                    findSubordinates(currentElf.name)
                }

            } else {
                currentElf.children.forEach { elf ->
                    currentElf = elf
                    findSubordinates(bossName)
                }
            }
        }

       findSubordinates(bossName)
        return allSubordinates
    }
}

fun main() {
    val th = TomteHierarki()
    th.createTree()

    println(th.root.children.get(0).name)
    println(th.root.children.get(0).children.get(1).name)
    println(th.root.children.get(0).children.get(1).children.get(0).name)
    println(th.root.children.get(0).children.get(1).children.get(0).children.get(0).name)

    val allSubordinates = th.findAllSubordinates("Glader")
    println(allSubordinates)

}
