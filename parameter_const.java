class Student {
    int id;

    Student(int i) {
        id = i;
    }

    void display() {
        System.out.println(id);
    }
}

public class parameter_const {
    public static void main(String[] args) {
        Student s = new Student(101);
        s.display();
    }
}