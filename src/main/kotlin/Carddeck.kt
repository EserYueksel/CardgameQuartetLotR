open class carddeck {
    var playerDwarves: MutableList<Race> = getDeckDwarves()
    var playerOrcs: MutableList<Race> = getDeckOrcs()
    var playerElves: MutableList<Race> = getDeckElves()
    var cpuDwarves: MutableList<Race> = getDeckDwarves()
    var cpuOrcs: MutableList<Race> = getDeckOrcs()
    var cpuElves: MutableList<Race> = getDeckElves()

    var deckSelected: Boolean = false
    var input: Int = 0
// TODO fun chooseDeck Erwartet vom Spieler eine Eingabe, in der eine Wahl getroffen werden muss, für welches Themendeck man sich entschieden hat
    fun chooseDeck(player: Player,cpu: CPU) {
// TODO try-catch Implementierung um bei einer falschen Eingabe einen Programmabsturz zu vermeiden
// TODO if-Verzweigung um verschiedene Eingaben/Zustände zu verarbeiten
        try {
        if (!deckSelected) {
            println(
                "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n"
                        + "Choose your deck \n" +
                        "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n" +
                        "1 Dwarves °°° 2 Orcs °°° 3 Elves \n" +
                        "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n"
            )
            do {
// TODO do-while Schleife um während eines bestimmten Zustandes einen definierten Feedback zu geben
                println("Please select a number between 1 and 3")
                input = readln().toInt()
            }   while (input > 3 || input <= 0)
            deckSelected = true
            println(input)
            Player().setInput(input)
            victory(player, cpu, input)
        }
        } catch (e: Exception){
            println("Please enter again - Choose between 1 and 3")
            chooseDeck(player, cpu)
        }
}
    fun victory(player: Player,cpu: CPU, input: Int){
// TODO If-Verzweigung
     if (input == 1) {
         if (player.score == 0 && cpu.score == 0){
             println("You have chosen the Dwarves!")
         }

         player.removeCard(playerDwarves)
         cpu.removeCard(cpuOrcs)
     } else if (input == 2) {
         println("You have chosen the Orcs!")
         player.removeCard(playerOrcs)
         cpu.removeCard(cpuElves)
     } else if (input == 3) {
         println("You have chosen the Elves!")
         player.removeCard(playerElves)
         cpu.removeCard(cpuDwarves)
     }
 }

    fun getDeckDwarves(): MutableList<Race> {
// TODO Funktion mit Rückgabewert
        var family: String = "Ironfists"
        var family2: String = "Longbeards"
        var family3: String = "Stonefoots"
        var family4: String = "Firebeards"

        var randomDwarveFamily: MutableList<String> = mutableListOf(family,family2,family3,family4)

        var dwarves: Dwarves = Dwarves("Gimli", 10, 8, 5,randomDwarveFamily.random())
        var dwarves1: Dwarves = Dwarves("Durin", 7,16,10,randomDwarveFamily.random())
        var dwarves2: Dwarves = Dwarves("Glóin",5,15,7,randomDwarveFamily.random())
        var dwarves3: Dwarves = Dwarves("Farin",9,12,13,randomDwarveFamily.random())
        var dwarves4: Dwarves = Dwarves("Dwalin",5,8,15,randomDwarveFamily.random())
        var dwarves5: Dwarves = Dwarves("Bifur",6,10,12,randomDwarveFamily.random())
        var dwarves6: Dwarves = Dwarves("Balin",16,5,10,randomDwarveFamily.random())
        var dwarves7: Dwarves = Dwarves("Thráin",8,4,13,randomDwarveFamily.random())
        var dwarves8: Dwarves = Dwarves("Náin",5,8,14,randomDwarveFamily.random())
        var dwarves9: Dwarves = Dwarves("Óin",6,7,5,randomDwarveFamily.random())
        var dwarves10: Dwarves = Dwarves("Azaghâl",11,6,9,randomDwarveFamily.random())
        var deckDwarves: MutableList<Race> = mutableListOf(dwarves,dwarves1,dwarves2,dwarves3,dwarves4,dwarves5,dwarves6,dwarves7,dwarves8,dwarves9,dwarves10)
        deckDwarves.shuffle()
        return deckDwarves
    }
    fun getDeckOrcs(): MutableList<Race> {
        var family: String = "Orcs of Isengard"
        var family2: String = "Orcs of Mordor"
        var family3: String = "Half-orcs"
        var family4: String = "Uruk-hai"
        var family5: String = "Eastern Orcs"

        var randomOrcFamily: MutableList<String> = mutableListOf(family,family2,family3,family4,family5)

        var orcs: Orcs = Orcs("Uglúk", 7, 6, 2, randomOrcFamily.random())
        var orcs1: Orcs = Orcs("Bolg",15,7,3, randomOrcFamily.random())
        var orcs2: Orcs = Orcs("Azog",16,7,5, randomOrcFamily.random())
        var orcs3: Orcs = Orcs("Gazneg",4,7,15,randomOrcFamily.random())
        var orcs4: Orcs = Orcs("Magol",5,10,10,randomOrcFamily.random())
        var orcs5: Orcs = Orcs("Vrasmaz",6,9,12,randomOrcFamily.random())
        var orcs6: Orcs = Orcs("Uzzog",8,3,13,randomOrcFamily.random())
        var orcs7: Orcs = Orcs("Boldkil",10,11,12,randomOrcFamily.random())
        var orcs8: Orcs = Orcs("Drugash",8,6,11,randomOrcFamily.random())
        var orcs9: Orcs = Orcs("Sharat",9,14,14,randomOrcFamily.random())
        var orcs10: Orcs = Orcs("Karnag",7,5,9,randomOrcFamily.random())
        var deckOrcs: MutableList<Race> = mutableListOf(orcs,orcs1,orcs2,orcs3,orcs4,orcs5,orcs6,orcs7,orcs8,orcs9,orcs10)
        deckOrcs.shuffle()
        return deckOrcs
    }
    fun getDeckElves(): MutableList<Race> {
        var family: String = "High Elves"
        var family2: String = "Wood Elves"
        var family3: String = "Dark Elves"

        var randomElveFamily: MutableList<String> = mutableListOf(family,family2,family3)

        var elves: Elves = Elves("Thranduil",15,5,12, randomElveFamily.random())
        var elves1: Elves = Elves("Elrond", 14,10,15, randomElveFamily.random())
        var elves2: Elves = Elves("Galadriel", 6,11,16, randomElveFamily.random())
        var elves3: Elves = Elves("Legolas", 9,9,10, randomElveFamily.random())
        var elves4: Elves = Elves("Laurie",12,6,5,randomElveFamily.random())
        var elves5: Elves = Elves("Lithiel",10,14,5,randomElveFamily.random())
        var elves6: Elves = Elves("Arwen",6,15,8,randomElveFamily.random())
        var elves7: Elves = Elves("Haldir",8,14,11,randomElveFamily.random())
        var elves8: Elves = Elves("Tauriel",5,15,9,randomElveFamily.random())
        var elves9: Elves = Elves("Celebron",4,12,7,randomElveFamily.random())
        var elves10: Elves = Elves("Orophin",13,14,4,randomElveFamily.random())

        var deckElves: MutableList<Race> = mutableListOf(elves,elves1,elves2,elves3,elves4,elves5,elves6,elves7,elves8,elves9,elves10)
        deckElves.shuffle()
        return deckElves
    }
}