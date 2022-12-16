// TODO Utility für Funktionen, die nicht häufig verwendet werden
fun greeting() {
    println(
        "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
        "Orcs, Dwarves & Elves - An LotR-based interactive Cardgame\n" +
        "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
        "Inspired by Lord of the Rings and with elements of an quartet card game\n" +
        "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n"
    )
}
// TODO fun compareScore Funktion um vom Spieler und CPU den Punktestand ausgeben zu können
// TODO If-Verzweigung
fun compareScore(cpu: CPU,player: Player){
    save
    if (cpu.get() < player.get()){
        player.score++
        println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n" +
                "Your score is ${player.score} \nEnemy score is ${cpu.score} \n")
    } else if (player.get() < cpu.get()){
        cpu.score++
        println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n" + "Enemy score is ${cpu.score} \nPlayer score is ${player.score} \n")
    } else {
        println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n" + "Draw!")
    }
    println("Player Points: ${player.score}")
    println("CPU Points: ${cpu.score}")
// TODO If-Verzweigung
    if (player.score == 3){
        println("Player has won!")
    } else if (cpu.score == 3) {
        println("CPU has won!")
    } else {
        carddeck().victory(player, cpu, saveInput)
        compareScore(cpu, player)
    }
}

