import java.util.*;

public class calculator_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        double num1 = sc.nextDouble();
        System.out.println("enter operator (+,-, *, /):");
        char operator = sc.next().charAt(0);
        System.out.println("enter the 2nd number:");
        double num2 = sc.nextDouble();
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid operator");
        }
        sc.close();
    }
}
