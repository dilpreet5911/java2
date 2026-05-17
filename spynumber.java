public class spynumber {
    public static void main(String[] args) {
        int num = 123;
        int sumofdigits = 0;
        int productofdigits = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sumofdigits += digit;
            productofdigits *= digit;
            temp /= 10;
        }
        if (sumofdigits == productofdigits) {
            System.out.println(num + " is a spy number");
        } else {
            System.out.println(num + " is not a spy number");
        }
    }
}
