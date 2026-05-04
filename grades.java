import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.print("A");
        } else if (marks >= 75) {
            System.out.print("B");
        } else if (marks >= 50) {
            System.out.print("C");
        } else

        {
            System.out.print("fail");
        }
    }
}