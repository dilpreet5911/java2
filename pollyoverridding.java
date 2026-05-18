class Transport {
    void move() {
        System.out.println("Transport is moving");
    }

    void fuel() {
        System.out.println("Transport uses fuel");
    }
}

class bus extends Transport {
    void move() {
        System.out.println("bus is moving");
    }

    void fuel() {
        System.out.println("bus uses diesel");
    }
}

class Train extends Transport {
    void move() {
        System.out.println("Train moves on track");
    }

    void fuel() {
        System.out.println("Train uses electricity");
    }
}

class Aeroplane extends Transport {
    void move() {
        System.out.println("Aeroplane fly in sky");
    }

    void fuel() {
        System.out.println("Aeroplane uses aviation fuel");
    }
}

public class pollyoverridding {
    public static void main(String args[]) {
        Transport t;
        t = new bus();
        t.move();
        t.fuel();
        System.out.println();
        t = new Train();
        t.move();
        t.fuel();
        System.out.println();
        t = new Aeroplane();
        t.move();
        t.fuel();
    }
}