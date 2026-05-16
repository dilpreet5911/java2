public class even_odd_count {
    public static void main(String[] args) {
        int num = 15597535;
        int even = 0;
        int odd = 0;
        while (num != 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }
        System.out.println("even digits: " + even);
        System.out.println("odd digits: " + odd);
    }
}
