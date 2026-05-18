import java.util.Scanner;

public class primitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int num = sc.nextInt();
        System.out.println("enter the float number");
        float f = sc.nextFloat();
        System.out.println("enter the charcter");
        char ch = sc.next().charAt(0);
        System.out.println("enter true or false");
        boolean b = sc.nextBoolean();
        System.out.println("Integers:" + num);
        System.out.println("Float:" + f);
        System.out.println("Char:" + ch);
        System.out.println("Boolean:" + b);
    }
}