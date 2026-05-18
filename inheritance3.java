class LivingBeing {
    void breathe() {
        System.out.println("All living being breathe .");
    }
}

class Animal extends LivingBeing {
    void eat() {
        System.out.println("Animals eats food.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("all birds can fly.");
    }
}

class Parrot extends Bird {
    void speak() {
        System.out.println("Parrot can speak.");
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.breathe();
        p.eat();
        p.fly();
        p.speak();

    }
}