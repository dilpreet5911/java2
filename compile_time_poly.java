class Demo {

    void show(int a) {
        System.out.println(a);
    }

    void show(String b) {
        System.out.println(b);
    }
}

public class compile_time_poly {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.show(10);
        d.show("Java");
    }
}