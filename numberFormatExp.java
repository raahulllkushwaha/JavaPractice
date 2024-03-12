public class numberFormatExp {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            int number = Integer.parseInt(str);
            System.out.println("Number is: " + number);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
