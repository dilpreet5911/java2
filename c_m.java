
class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // Method
    public void display() {
        System.out.println("Animal: " + name + ", Age: " + age);
    }
}

public class c_m {
    public static void main(String[] args) {
        Animal a = new Animal("Lion", 5);
        a.display();
    }
}