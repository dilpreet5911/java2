public class triangle {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("triangle is valid");
        } else {
            System.out.println("triangle is not valid");
        }
    }
}