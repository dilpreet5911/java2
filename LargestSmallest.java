import java.util.*;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = a;
        int smallest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);

    }

}