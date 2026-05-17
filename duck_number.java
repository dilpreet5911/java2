public class duck_number {
    public static void main(String[] args) {
        int num = 1023;
        String strNum = Integer.toString(num);
        boolean isduck = true;
        for (char digit : strNum.toCharArray()) {
            if (digit == '0') {
                isduck = false;
                break;
            }
        }
        if (isduck) {
            System.out.println(num + " is a duck number");
        } else {
            System.out.println(num + " is not a duck number");
        }
    }
}
