fun main() {
    var player: Player = Player()
    var cpu: CPU = CPU()
    var carddeck: carddeck = carddeck()

    greeting()
    carddeck.chooseDeck(player,cpu)
    compareScore(cpu, player)
}



