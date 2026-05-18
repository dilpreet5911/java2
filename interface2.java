interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming!");
    }
}

public class interface2 {
    public static void main(String[] args) {
        Duck duck = new Duck("Donald");
        duck.fly();
        duck.swim();
    }
}