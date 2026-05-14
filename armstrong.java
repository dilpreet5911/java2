public class armstrong {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int rem = 0;
        int result = 0;
        while (originalNum != 0) {
            rem = originalNum % 10;
            result = result + rem * rem * rem;
            originalNum = originalNum / 10;
        }
        if (result == num) {
            System.out.println(num + "is an armstrong number");
        } else {
            System.out.println(num + "is not an armstrong number");
        }
    }
}
