class Count {
    static int x = 0;

    Count() {
        x++;
        System.out.println(x);
    }
}

public class static_variable {
    public static void main(String[] args) {
        new Count();
        new Count();
    }
}