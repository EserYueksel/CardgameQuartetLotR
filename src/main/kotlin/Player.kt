// TODO var save zum speichern der Auswahl
var save: Map<String,Int> = mutableMapOf("" to 0)
var saveName: String = ""
// TODO var saveInput für Deckauswahl-Speicherung / bei neuer Runde wird dann nicht mehr benötigt
// TODO das man ein neues Deck auswählen soll
var saveInput: Int = 0

class Player() {
// TODO var score zum speichern des Punktestands
    var score: Int = 0
// TODO Die Funktion removeCard lässt den Spieler, nachdem ihm sein jeweiliges Deck zugewiesen wurde, jeweils von seinem Kartenstapel
// TODO die oberste Karte/Topkarte mit .removeFirst ziehen und die jeweiligen Eigenschaften der gezogenen Karte ausgeben
// TODO  Hier haben wir das Problem, dass chooseOption übersprungen wird
    fun removeCard(Races: MutableList<Race>) {
            var removedCard: Race = Races.removeFirst()
            println(
                "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
                "Player turn. \n" + "You draw a card.\n" +
                "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°"
            )
            println(
                "Your card is: ${removedCard.name} \n Origin ${removedCard.randomFamily} \n Attack ${removedCard.atk} \n Defense ${removedCard.def} \n MagicPower ${removedCard.mp}\n" +
                "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°")
            chooseOption(mutableMapOf("Attack" to removedCard.atk,"Defense" to removedCard.def,"MagicPower" to removedCard.mp))
        }

    fun getKey(): String {
        get()
        return saveName
    }
    fun setInput(value: Int) {
        saveInput = value
    }
    fun get(): Int {
        var saveValue = 0
        if (save["Attack"] != null) {
            saveValue = save["Attack"]!!
            saveName = "Attack"
        } else if (save["Defense"] != null){
            saveValue = save["Defense"]!!
            saveName = "Defense"
        } else if (save["MagicPower"] != null){
            saveValue = save["MagicPower"]!!
            saveName = "MagicPower"
        }
    return saveValue
    }
}
// TODO mit .filter wird "gefiltert" was in den geschweiften Klammern steht, in dem Fall die Bedingung "Attack"
// TODO var filterMap = options.filter { (key,value) -> key == "Attack" && value == 1 }
    fun chooseOption(options: MutableMap<String,Int>): Map<String,Int> {
        println("Choose your value you want to compete with.\n" + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
            "1 for Attack °°° 2 for Defense °°° 3 for MagicPower \n" +
            "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n")
        var confirmSelection: Int = readln().toInt()
// TODO If-Verzweigung
        if (confirmSelection == 1){
            var filterMap = options.filter { (key) -> key == "Attack" }
            save = filterMap
            println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
                    "You will compete against the CPU with Attack! \n It has following value: ${save["Attack"]}")

        } else if (confirmSelection == 2) {
            var filterMap = options.filter { (key) -> key == "Defense" }
            save = filterMap
            println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
                    "You will compete against the CPU with Defense! \n It has following value: ${save["Defense"]}")
        } else if (confirmSelection == 3) {
            var filterMap = options.filter { (key) -> key == "MagicPower" }
            save = filterMap
            println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
                    "You will compete against the CPU with MagicPower! \n It has following value: ${save["MagicPower"]}")
        }
        return save
}
