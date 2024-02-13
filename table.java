import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for printing the table from 2-10");
        System.out.println("Press 2 for print the factorial entered on command line");
        long result = 1;
        int fact = Integer.parseInt(args[0]);

        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                for (int i = 2; i <= 10; i++) {

                    System.out.println("\n Multiplication for table " + i + "\n");
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + "*" + j + "=" + (i * j));
                    }
                }
                break;
            case 2:
                for (int i = 2; i <= fact; i++) {
                    result *= i;

                }
        }
        System.out.println("Factorial of " + fact + " is: " + result);
    }
}