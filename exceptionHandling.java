public class exceptionHandling {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(arr[0]);
        try {
            System.out.println(arr[-1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(arr[2]);
    }
}
