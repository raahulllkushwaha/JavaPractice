import java.util.Scanner;

class Student {
    String name;
    int[] subjectMarks = new int[5];

    Student(String name, int[] marks) {
        this.name = name;
        this.subjectMarks = marks;
    }

    void printResult() {
        System.out.println("Student: " + name);
        System.out.print("Subject Marks: ");
        for (int mark : subjectMarks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

public class ResultPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array to store instances of the Student class
        Student[] students = new Student[4];

        // Taking user input for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter marks for 5 subjects (separated by spaces): ");
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume the newline character

            students[i] = new Student(name, marks);
        }

        // Printing results for each student
        for (Student student : students) {
            student.printResult();
        }
    }
}
