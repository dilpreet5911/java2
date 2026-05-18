class Animal {
    Animal() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog");
    }
}

public class super_key_word {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}