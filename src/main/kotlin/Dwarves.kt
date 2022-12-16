class Dwarves(name: String, atk: Int, def: Int, mp: Int): Race(name,atk,def,mp) {
// TODO Vererbung durch Race
// TODO class Dwarves mit primärem Konstruktor und sekundärem Konstruktor
    constructor(name: String, atk: Int, def: Int, mp: Int, randomFamily: String): this(name, atk, def, mp){
        this.randomFamily = randomFamily
    }

}

