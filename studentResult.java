
//Write a program in java to print result of 4 students of 5 subjects minimum 2 classes are required 
import java.util.Scanner;

public class studentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1;
        System.out.println("Enter the  name of first student");
        name1 = sc.nextLine();

        System.out.println("Enter the marks of the first student");
        int marks[] = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        sc.nextLine();
        String name2;
        System.out.println("Enter the name of second student");
        name2 = sc.nextLine();

        System.out.println("Enter the marks of the second student");
        int marks2[] = new int[5];
        for (int i = 0; i < marks2.length; i++) {
            marks2[i] = sc.nextInt();
        }
        sc.nextLine();
        String name3;
        System.out.println("Enter the name of third student");
        name3 = sc.nextLine();

        System.out.println("Enter the marks of the third student");
        int marks3[] = new int[5];
        for (int i = 0; i < marks3.length; i++) {
            marks3[i] = sc.nextInt();
        }
        sc.nextLine();
        String name4;
        System.out.println("Enter the name of fourth student");
        name4 = sc.nextLine();

        System.out.println("Enter the marks of the fourth student");
        int marks4[] = new int[5];
        for (int i = 0; i < marks4.length; i++) {
            marks4[i] = sc.nextInt();
        }

        int sum1 = 0;
        for(int mark : marks){
            sum1 += mark;
        }
        double percentage1 = (double) sum1 / marks.length;

        char grade1;
        if (percentage1 >= 90) {
            grade1 = 'A';
        } else if (percentage1 >= 80) {
            grade1 = 'B';
        } else if (percentage1 >= 70) {
            grade1 = 'C';
        } else if (percentage1 >= 60) {
            grade1 = 'D';
        } else {
            grade1 = 'F';
        }

        // Print or use the result for the first student
        System.out.println("Result for " + name1 + ":");
        System.out.println("Sum: " + sum1);
        System.out.println("Percentage: " + percentage1);
        System.out.println("Grade: " + grade1);

        int sum2 = 0;
        for(int mark : marks2){
            sum2 += mark;
        }
        double percentage2 = (double) sum2 / marks2.length;

        char grade2;
        if (percentage2 >= 90) {
            grade2 = 'A';
        } else if (percentage2 >= 80) {
            grade2 = 'B';
        } else if (percentage2 >= 70) {
            grade2 = 'C';
        } else if (percentage2 >= 60) {
            grade2 = 'D';
        } else {
            grade2 = 'F';
        }

        // Print or use the result for the first student
        System.out.println("Result for " + name1 + ":");
        System.out.println("Sum: " + sum2);
        System.out.println("Percentage: " + percentage2);
        System.out.println("Grade: " + grade2);

    }
}
