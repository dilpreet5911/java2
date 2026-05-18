class Shape {
    void draw() {
        System.out.println("Drawing");
    }
}

class Circle extends Shape {
    void circle() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    void rectangle() {
        System.out.println("Rectangle");
    }
}

public class hiarchial_inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.circle();

        Rectangle r = new Rectangle();
        r.draw();
        r.rectangle();
    }
}