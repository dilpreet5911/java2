class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat says: Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Cow says: Moo!");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Cow();
        a1.sound();
        a2.sound();
    }
}