abstract class Parent {
    void printMe() {
        println "Hello from Parent"
    }
}

trait TraitA {
    void printMe() {
        System.out.println("Hello from TraitA");
    }
}

trait TraitB {
    void printMe() {
        System.out.println("Hello from TraitB");
    }
}

class Child extends Parent implements TraitA, TraitB {
    void printMe() {
        TraitA.super.printMe()
        TraitB.super.printMe()
        super.printMe()
        println "Hello from Child"
    }
}

new Child().printMe()
