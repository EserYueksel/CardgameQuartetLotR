class CPU() {
    var save: Int = 0
    var score: Int = 0

    fun get(): Int {
        return save
    }
    fun removeCard(cpus: MutableList<Race>) {
        var removedCard: Race = cpus.removeFirst()
        println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
                "CPU turn. \n" + "CPU draws a card.\n" +
                "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°")
        println("CPU card is: ${removedCard.name} \n Origin ${removedCard.randomFamily} \n Attack ${removedCard.atk} \n Defense ${removedCard.def} \n MagicPower ${removedCard.mp} \n " +
                "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°")
        chooseOption(mutableMapOf("Attack" to removedCard.atk,"Defense" to removedCard.def,"MagicPower" to removedCard.mp))
    }
    fun chooseOption(options: MutableMap<String,Int>) {
        println("CPU choosing card value ...")
        // Wählt zufällig eine Eigenschaft aus, wenn der CPU Spieler mit der Runde beginnt
        val confirmName = Player().getKey()
// TODO Verzweigung für die korrekte Vergleichung der Kartenwerte
        if (confirmName == "Attack"){
            println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +"The CPU will compete against the enemy with Attack!\n It has following value: ")
            println(options["Attack"])
            save = options["Attack"]!!
        } else if (confirmName == "Defense") {
            println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +"The CPU will compete against the enemy with Defense!\n It has following value: ")
            println(options["Defense"])
            save = options["Defense"]!!
        } else if (confirmName == "MagicPower") {
            println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +"The CPU will compete against the enemy with MagicPower!\n It has following value: ")
            println(options["MagicPower"])
            save = options["MagicPower"]!!
        }
        println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
                "Enemy turn - hold fast! \n" + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n")
    }
}

