public class try_catch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int result = a / b;
            System.out.println("Result:" + result);
        } catch (ArithmeticException e) {
            System.out.println("error occured");
        } finally {
            System.out.println("This block will always execute");
        }
    }

}