
import java.util.Scanner;

class Student {
    int roll;
    String name;
    float marks;
}

public class NewWay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("\nEnter details of student " + (i+1));

            System.out.print("Roll No: ");
            s[i].roll = sc.nextInt();

            System.out.print("Name: ");
            s[i].name = sc.next();

            System.out.print("Marks: ");
            s[i].marks = sc.nextFloat();
        }

        System.out.println("\n----- Student Details -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i+1));
            System.out.println("Roll: " + s[i].roll);
            System.out.println("Name: " + s[i].name);
            System.out.println("Marks: " + s[i].marks);
        }
    }
}
