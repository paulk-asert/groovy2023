import groovy.transform.TupleConstructor

trait Fighter {
    int health
    int strength
    void fight(Fighter enemy) {
        health -= enemy.strength
        enemy.health -= strength
        if (health <= 0) println "$name has lost"
        if (enemy.health <= 0) println "$enemy.name was defeated"
    }
}

trait HasName {
    String name
}

@TupleConstructor(allProperties=true)
class Player implements Fighter, HasName { }

@TupleConstructor(allProperties=true)
class Boss implements Fighter, HasName { }

var p1 = new Player('Bowser', 60, 30)
var p2 = new Player('Mario', 60, 30)
var p3 = new Player('Sonic', 60, 30)
var boss = new Boss('Giga Bowser', 90, 50)
p1.fight(boss)
p2.fight(boss)
p3.fight(boss)
