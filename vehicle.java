abstract class VehicleBase {
    abstract void start();

    abstract void stop();
}

class car extends VehicleBase {
    @Override
    void start() {
        System.out.println("car is started");
    }

    @Override
    void stop() {
        System.out.println("car is stopped");
    }
}

class bike extends VehicleBase {
    @Override
    void start() {
        System.out.println("bike is started");
    }

    @Override
    void stop() {
        System.out.println("bike is stopped");
    }
}

public class vehicle {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();

        bike b = new bike();
        b.start();
        b.stop();
    }
}
