
abstract class shape {
    String color;

    public shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public void display() {
        System.out.println("Color: " + color + ", Area: " + area());
    }
}

class Circle extends shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}

class AbstractDemo {

    public static void main(String[] args) {
        Circle c = new Circle("Red", 3.0);
        c.display();
    }
}