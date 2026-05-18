class Test {
    int x;

    Test(int a) {
        x = a;
    }

    Test(Test t) {
        x = t.x;
    }

    void display() {
        System.out.println(x);
    }
}

public class copy_construct {
    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = new Test(t1);

        t2.display();
    }
}