class Demo {
    final int x = 100;

    void show() {
        System.out.println(x);
    }
}

public class final_variable {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}