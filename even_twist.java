public class even_twist {
    public static void main(String[] args) {
        int num = 100;
        if (num % 4 == 0) {
            System.out.println("super even");
        } else if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
