import java.util.Scanner;
public class takingInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println(sum);
    }
}
//run java kiya program nhi chl tha tha debug java kiya toh chlne lga sb shi wrna user se input nhi le rha tha