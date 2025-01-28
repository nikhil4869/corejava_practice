package com.example.Oops.Inheritance.Hierarchicle;

// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Bulldog extends Dog {
    void bulldogBehaviour() {
        System.out.println("The bulldog has a unique behaviour.");
    }
}

class Poodle extends Dog {
    void poodleBehaviour() {
        System.out.println("The poodle has a unique behaviour.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

class PersianCat extends Cat {
    void persianCatBehaviour() {
        System.out.println("The Persian cat has a unique behaviour.");
    }
}

class SiameseCat extends Cat {
    void siameseCatBehaviour() {
        System.out.println("The Siamese cat has a unique behaviour.");
    }
}

// Main class to test the inheritance
public class Main {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog();
        Poodle poodle = new Poodle();
        PersianCat persianCat = new PersianCat();
        SiameseCat siameseCat = new SiameseCat();
        System.out.println();

        bulldog.eat();
        bulldog.bark();
        bulldog.bulldogBehaviour();
        System.out.println();

        poodle.eat();
        poodle.bark();
        poodle.poodleBehaviour();
        System.out.println();

        persianCat.eat();
        persianCat.meow();
        persianCat.persianCatBehaviour();
        System.out.println();

        siameseCat.eat();
        siameseCat.meow();
        siameseCat.siameseCatBehaviour();
    }
}
