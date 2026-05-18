class vehicle {
    void run() {
        System.out.println("vehicle can run");
    }
}

class Car extends vehicle {
    void fuel() {
        System.out.println("car uses fuel");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("Electric uses battery");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.run();
        e.fuel();
        e.battery();

    }

}