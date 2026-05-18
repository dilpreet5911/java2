import java.util.Scanner;

public class student_details {
    static void showStudent(String name, int age, int rollNo) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        showStudent("dilpreet", 18, 101);
        showStudent("gagan", 19, 102);
        showStudent("aman", 18, 103);
        showStudent("goldy", 20, 104);
        showStudent("priyanshu", 19, 105);
    }
}