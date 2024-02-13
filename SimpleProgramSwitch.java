import java.util.Scanner;

public class SimpleProgramSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a program to execute:");
        System.out.println("1. Factorial");
        System.out.println("2. Fibonacci");
        System.out.println("3. Prime Number Check");
        System.out.println("4. Palindrome String Check");
        System.out.println("5. Palindrome Number Check");
        System.out.println("6. Pascal's Triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number to find its factorial: ");
                int numFactorial = scanner.nextInt();
                int factorial = 1;
                for (int i = 1; i <= numFactorial; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + numFactorial + " is: " + factorial);
                break;

            case 2:
                System.out.print("Enter the number of terms for Fibonacci series: ");
                int numTerms = scanner.nextInt();
                int a = 0, b = 1;
                System.out.print("Fibonacci series: ");
                for (int i = 0; i < numTerms; i++) {
                    System.out.print(a + " ");
                    int c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println();
                break;

            case 3:
                System.out.print("Enter a number to check for prime: ");
                int numPrime = scanner.nextInt();
                boolean isPrime = true;
                if (numPrime <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(numPrime); i++) {
                        if (numPrime % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                System.out.println(numPrime + " is " + (isPrime ? "prime." : "not prime."));
                break;

            case 4:
                System.out.print("Enter a string to check for palindrome: ");
                String strPalindrome = scanner.next();
                boolean isPalindromeStr = true;
                for (int i = 0; i < strPalindrome.length() / 2; i++) {
                    if (strPalindrome.charAt(i) != strPalindrome.charAt(strPalindrome.length() - 1 - i)) {
                        isPalindromeStr = false;
                        break;
                    }
                }
                System.out.println(strPalindrome + " is " + (isPalindromeStr ? "a palindrome." : "not a palindrome."));
                break;

            case 5:
                System.out.print("Enter a number to check for palindrome: ");
                int numPalindrome = scanner.nextInt();
                int originalNum = numPalindrome;
                int reversedNum = 0;
                while (numPalindrome > 0) {
                    int digit = numPalindrome % 10;
                    reversedNum = reversedNum * 10 + digit;
                    numPalindrome /= 10;
                }
                System.out.println(originalNum + " is " + (originalNum == reversedNum ? "a palindrome." : "not a palindrome."));
                break;

            case 6:
                System.out.print("Enter the number of rows for Pascal's Triangle: ");
                int numRows = scanner.nextInt();
                for (int i = 0; i < numRows; i++) {
                    int coefficient = 1;
                    for (int j = 0; j <= i; j++) {
                        System.out.print(coefficient + " ");
                        coefficient = coefficient * (i - j) / (j + 1);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }
    }
}

