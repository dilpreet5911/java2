import java.util.*;

public class divisibility_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.println("fizz");
        } else if (num % 5 == 0) {
            System.out.println("buzz");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("fizzbuzz");
        } else {
            System.out.println(num);
        }
        sc.close();
    }
}
