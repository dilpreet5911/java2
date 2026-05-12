abstract class vehical {
    int wheels;

    abstract void start();
}

class car extends vehical {
    car() {
        wheels = 4;
    }

    @Override
    void start() {
        System.out.println("car start with key");
    }
}

class scooty extends vehical {
    scooty() {
        wheels = 2;
    }

    @Override
    void start() {
        System.out.println("scooty start with key");
    }
}

public class vehical {
    public static void main(String[] args) {
        car c = new car();
        c.start();

        scooty s = new scooty();
        s.start();
    }
}
