import java.util.Scanner;

public class additonUsingSwitchCase {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for Modulus");
        int ch = s1.nextInt();

        switch (ch) {
            case 1:
                int a, b;
                System.out.println("Enter the first number for addition");
                a = s1.nextInt();
                System.out.println("Enter the second number for addition");
                b = s1.nextInt();
                System.out.println("The sum of the two numbers is:- " + (a + b));
                break;

            case 2:
                int c, d;
                System.out.println("Enter the first number for substraction");
                c = s1.nextInt();
                System.out.println("Enter the second number for substraction");
                d = s1.nextInt();
                System.out.println("The sum of the two numbers is:- " + (c - d));
                break;

            case 3:
                int e, f;
                System.out.println("Enter the first number for multiplication");
                e = s1.nextInt();
                System.out.println("Enter the second number for multiplication");
                f = s1.nextInt();
                System.out.println("The sum of the two numbers is:- " + (e * f));
                break;

            case 4:
                double g, h;
                System.out.println("Enter the first number for division");
                g = s1.nextInt();
                System.out.println("Enter the second number for division");
                h = s1.nextInt();
                System.out.println("The sum of the two numbers is:- " + (g / h));
                break;

            case 5:
                double i, j;
                System.out.println("Enter the first number for modulus");
                i = s1.nextInt();
                System.out.println("Enter the second number for modulus");
                j = s1.nextInt();
                System.out.println("The sum of the two numbers is:- " + (i % j));
                break;
        }

    }
}
