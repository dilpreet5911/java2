import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter inches:");
        double inches = sc.nextDouble();
        double meters = inches * 0.0254;
        System.out.println("Meters = " + meters);
    }

}
