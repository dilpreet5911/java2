abstract class vehical {
    int wheels;

    abstract void main();

    class car extends vehical {
        car(){
            wheel = 4;
        }
    void start();
    System.out.println("car start with key");
    }
}

class scooty extends vehical {
    scooty() {
        wheels = 2;
    }

}

    void start() {
        System.out.println("scooty start with key");
    }

    public class vehical {
    public static void main (String[] args){
       car c = new car();
       c.start();
       scooty s = new scooty();
       s.start();     
}